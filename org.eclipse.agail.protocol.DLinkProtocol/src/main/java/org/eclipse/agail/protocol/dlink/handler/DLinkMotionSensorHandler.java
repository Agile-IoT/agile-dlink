package org.eclipse.agail.protocol.dlink.handler;

import org.eclipse.agail.protocol.dlink.webapi.SStackWebApiConsumer;

import org.eclipse.agail.protocol.dlink.internal.motionsensor.DLinkMotionSensorCommunication;
import org.eclipse.agail.protocol.dlink.internal.motionsensor.DLinkMotionSensorConfig;
import org.eclipse.agail.protocol.dlink.internal.motionsensor.DLinkMotionSensorListener;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DLinkMotionSensorHandler implements DLinkMotionSensorListener {

    protected Logger logger = LoggerFactory.getLogger(DLinkMotionSensorHandler.class);

    private static final String OK = "ok";
    private static final String DETECT = "detect";
    private static final int OK_COUNTER_MILLIS = 5000;
    private static final String INSTALLATION_ID = "[INSTALLATION ID HERE]";
    private static final String SENSOR_ID = "[SENSOR ID HERE]";

    private DLinkMotionSensorCommunication motionSensor;

    private ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);

    private String status = OK;
    private volatile int counter = OK_COUNTER_MILLIS;

    private volatile boolean isRunning = true;
    
    private SStackWebApiConsumer client;

    public DLinkMotionSensorHandler() {
        final DLinkMotionSensorConfig config = new DLinkMotionSensorConfig("[DLINK SENSOR IP HERE]", "DLINK SENSOR PIN HERE");
        client = new SStackWebApiConsumer();
        motionSensor = new DLinkMotionSensorCommunication(config, this, scheduler);

        okThread.start();
    }

    public void motionDetected() {
        logger.debug("MOTION DETECTED");

        counter = OK_COUNTER_MILLIS;
        setStatusAndReport(DETECT);
    }

    private void setStatusAndReport(String newStatus){
        synchronized (status) {
            if (!status.equals(newStatus)) {
                status = newStatus;
                client.reportSensorStatus(SENSOR_ID, status);
            }
        }
    }

    public String getStatus() {
        return status;
    }

    public void sensorStatus(final DLinkMotionSensorCommunication.DeviceStatus status) {
        // handle status updates
        switch (status) {
            case ONLINE:
                break;
            case COMMUNICATION_ERROR:
                break;
            case INVALID_PIN:
                break;
            case INTERNAL_ERROR:
                break;
            case UNSUPPORTED_FIRMWARE:
                break;
            default:
                break;
        }
    }

    public void dispose() {
        if (motionSensor != null) {
            motionSensor.dispose();
            isRunning = false;
            
            try{
                okThread.join(500); 
            } catch (Exception e){
                
            }
        }
    }

    private Thread okThread = new Thread(new Runnable() {
        @Override
        public void run(){
            while(isRunning){
                if(status.equals(DETECT)){
                    counter -= 100;    
                    if(counter <= 0){
                        setStatusAndReport(OK);
                    }
                }

                try{
                    Thread.sleep(100);
                } catch (Exception e) {

                }
            }
        }
    });
}
