package org.eclipse.agail.protocol.dlink.internal.motionsensor;

import java.util.Date;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

import javax.xml.soap.MessageFactory;
import javax.xml.soap.MimeHeaders;
import javax.xml.soap.SOAPBody;
import javax.xml.soap.SOAPElement;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPMessage;

import org.eclipse.agail.protocol.dlink.internal.DLinkHNAPCommunication;
import org.w3c.dom.Document;
import org.w3c.dom.Node;

public class DLinkMotionSensorCommunication extends DLinkHNAPCommunication {
    private static final String DETECTION_ACTION = "\"http://purenetworks.com/HNAP1/GetLatestDetection\"";

    private static final int DETECT_TIMEOUT_MS = 5000;
    private static final int DETECT_POLL_S = 1;

    public enum DeviceStatus {
        INITIALISING,
        ONLINE,
        COMMUNICATION_ERROR,
        INTERNAL_ERROR,
        UNSUPPORTED_FIRMWARE,
        INVALID_PIN
    }

    private final DLinkMotionSensorListener listener;

    private SOAPMessage detectionAction;

    private boolean loginSuccess;
    private boolean detectSuccess;

    private long prevDetection;
    private long lastDetection;

    private final ScheduledFuture<?> detectFuture;

    private boolean online = true;
    private DeviceStatus status = DeviceStatus.INITIALISING;

    private final Runnable detect = new Runnable() {
        @Override
        public void run() {
            boolean updateStatus = false;

            switch (status) {
                case INITIALISING:
                    online = false;
                    updateStatus = true;
                    // FALL-THROUGH
                case COMMUNICATION_ERROR:
                case ONLINE:
                    if (!loginSuccess) {
                        login(detectionAction, DETECT_TIMEOUT_MS);
                    }

                    if (!getLastDetection(false)) {
                        login(detectionAction, DETECT_TIMEOUT_MS);
                        getLastDetection(true);
                    }
                    break;
                default:
                    break;
            }

            if (loginSuccess && detectSuccess) {
                System.out.println("Success last: " + lastDetection + " prev: " + prevDetection);
                status = DeviceStatus.ONLINE;
                if (!online) {
                    online = true;
                    listener.sensorStatus(status);

                    prevDetection = lastDetection;
                }

                if (lastDetection != prevDetection) {
                    listener.motionDetected();
                }
            } else {
                if (online || updateStatus) {
                    online = false;
                    listener.sensorStatus(status);
                }
            }
        }
    };

    public DLinkMotionSensorCommunication(final DLinkMotionSensorConfig config, final DLinkMotionSensorListener listener, final ScheduledExecutorService scheduler) {
        super(config.ipAddress, config.pin);
        this.listener = listener;

        if (getHNAPStatus() == HNAPStatus.INTERNAL_ERROR) {
            status = DeviceStatus.INTERNAL_ERROR;
        }

        try {
            final MessageFactory messageFactory = MessageFactory.newInstance();
            detectionAction = messageFactory.createMessage();

            buildDetectionAction();
        } catch (final SOAPException e) {
            status = DeviceStatus.INTERNAL_ERROR;
        }

        detectFuture = scheduler.scheduleWithFixedDelay(detect, 0, DETECT_POLL_S, TimeUnit.SECONDS);
    }

    @Override
    public void dispose() {
        detectFuture.cancel(true);
        super.dispose();
    }

    private void buildDetectionAction() throws SOAPException {
        detectionAction.getSOAPHeader().detachNode();
        final SOAPBody soapBody = detectionAction.getSOAPBody();
        final SOAPElement soapBodyElem = soapBody.addChildElement("GetLatestDetection", "", HNAP_XMLNS);
        soapBodyElem.addChildElement("ModuleID").addTextNode("1");

        final MimeHeaders headers = detectionAction.getMimeHeaders();
        headers.addHeader(SOAPACTION, DETECTION_ACTION);
    }

    private void unexpectedResult(final String message, final Document soapResponse) {
        System.out.println(message + " " + soapResponse);

        status = DeviceStatus.UNSUPPORTED_FIRMWARE;
    }

    private void login(final SOAPMessage action, final int timeout) {
        loginSuccess = false;

        login(timeout);
        setAuthenticationHeaders(action);

        switch (getHNAPStatus()) {
            case LOGGED_IN:
                loginSuccess = true;
                break;
            case COMMUNICATION_ERROR:
                status = DeviceStatus.COMMUNICATION_ERROR;
                break;
            case INVALID_PIN:
                status = DeviceStatus.INVALID_PIN;
                break;
            case INTERNAL_ERROR:
                status = DeviceStatus.INTERNAL_ERROR;
                break;
            case UNSUPPORTED_FIRMWARE:
                status = DeviceStatus.UNSUPPORTED_FIRMWARE;
                break;
            case INITIALISED:
            default:
                break;
        }
    }

    private boolean getLastDetection(final boolean isRetry) {
        detectSuccess = false;

        if (loginSuccess) {
            try {
                final Document soapResponse = sendReceive(detectionAction, DETECT_TIMEOUT_MS);

                final Node result = soapResponse.getElementsByTagName("GetLatestDetectionResult").item(0);

                if (result != null) {
                    if (OK.equals(result.getTextContent())) {
                        final Node timeNode = soapResponse.getElementsByTagName("LatestDetectTime").item(0);

                        if (timeNode != null) {
                            prevDetection = lastDetection;
                            lastDetection = Long.valueOf(timeNode.getTextContent());
                            detectSuccess = true;
                        } else {
                            unexpectedResult("getLastDetection - Unexpected response", soapResponse);
                        }
                    } else if (isRetry) {
                        unexpectedResult("getLastDetection - Unexpected response", soapResponse);
                    }
                } else {
                    unexpectedResult("getLastDetection - Unexpected response", soapResponse);
                }
            } catch (final Exception e) {
                if (status != DeviceStatus.COMMUNICATION_ERROR) {
                    status = DeviceStatus.COMMUNICATION_ERROR;
                }
            }
        }

        return detectSuccdess;
    }
}