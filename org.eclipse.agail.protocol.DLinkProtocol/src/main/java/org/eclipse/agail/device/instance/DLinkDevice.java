package org.eclipse.agail.device.instance;

import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.freedesktop.dbus.Variant;
import org.freedesktop.dbus.exceptions.DBusException;

import org.eclipse.agail.Device;
import org.eclipse.agail.Protocol;
import org.eclipse.agail.device.base.DeviceImp;
import org.eclipse.agail.exception.AgileNoResultException;
import org.eclipse.agail.object.DeviceComponent;
import org.eclipse.agail.object.DeviceOverview;
import org.eclipse.agail.object.DeviceDefinition;
import org.eclipse.agail.object.DeviceStatusType;
import org.eclipse.agail.object.StatusType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DLinkDevice extends DeviceImp implements Device {
    protected Logger logger = LoggerFactory.getLogger(DLinkDevice.class);

    public static final String deviceTypeName = "DLINK";

    /**
     * DLink Protocol imp DBus interface id
     */
    private static final String DLINK_PROTOCOL_ID = "org.eclipse.agail.protocol.DLink";
    /**
     * DLink Protocol imp DBus interface path
     */
    private static final String DLINK_PROTOCOL_PATH = "/org/eclipse/agail/protocol/DLink";

    private static final String DLINK_COMPONENT = "DLinkData";

    private DeviceStatusType deviceStatus = DeviceStatusType.DISCONNECTED;

	{
        profile.add(new DeviceComponent(DLINK_COMPONENT, "dlink"));
        subscribedComponents.put(DLINK_COMPONENT, 0);
    }

    public DLinkDevice(DeviceOverview deviceOverview) throws DBusException {
        super(deviceOverview);

        this.protocol = DLINK_PROTOCOL_ID;
        String devicePath = AGILE_DEVICE_BASE_BUS_PATH + "dlink" + deviceOverview.id.replace(":", "");

        try {
            dbusConnect(deviceAgileID, devicePath, this);
        } catch (Exception e) {
            logger.debug("Error creating dlink device connection", e);
            throw e;
        }

        deviceProtocol = (Protocol) connection.getRemoteObject(DLINK_PROTOCOL_ID, DLINK_PROTOCOL_PATH, Protocol.class);

        try {
            deviceProtocol.Read(address, new HashMap<>());
        } catch (Exception e) {
            logger.warn("Error while reading", e);
        }

        logger.debug("Exposed device {} {}", deviceAgileID, devicePath);
    }

    public DLinkDevice(DeviceDefinition devicedefinition) throws DBusException {
        super(devicedefinition);

        this.protocol = DLINK_PROTOCOL_ID;
        String devicePath = AGILE_DEVICE_BASE_BUS_PATH + "dlink" + devicedefinition.address.replace(":", "");

        try {
            dbusConnect(deviceAgileID, devicePath, this);
        } catch (Exception e) {
            logger.debug("Error creating dlink device connection", e);
            throw e;
        }

        deviceProtocol = (Protocol) connection.getRemoteObject(DLINK_PROTOCOL_ID, DLINK_PROTOCOL_PATH, Protocol.class);

        try {
            deviceProtocol.Read(address, new HashMap<>());
        } catch (Exception e) {
            logger.warn("Error while reading", e);
        }

        logger.debug("Exposed device {} {}", deviceAgileID, devicePath);
    }

    public static boolean Matches(DeviceOverview d) {
    	return d.name.toUpperCase().contains(deviceTypeName.toUpperCase());
  	}

  	@Override
    protected String DeviceRead(String componentName) {
        if ((protocol.equals(DLINK_PROTOCOL_ID)) && (deviceProtocol != null)) {
            if (isConnected()) {
                if (isSensorSupported(componentName.trim())) {
                    try {
                        return formatReading(componentName, deviceProtocol.Read(DLINK_COMPONENT, new HashMap<String, String>()));
                    } catch (DBusException e) {
                        logger.error("Error while reading", e);
                    }
                } else {
                    throw new AgileNoResultException("Componet not supported:" + componentName);
                }
            } else {
                throw new AgileNoResultException("Device not connected: " + deviceName);
            }
        } else {
            throw new AgileNoResultException("Protocol not supported: " + protocol);
        }

        throw new AgileNoResultException("Unable to read " + componentName);
    }

    @Override
    public void Subscribe(String componentName) {
        if ((protocol.equals(DLINK_PROTOCOL_ID)) && (deviceProtocol != null)) {
            if (isConnected()) {
                if (isSensorSupported(componentName.trim())) {
                    try {
                        if (!hasOtherActiveSubscription()) {
                            addNewRecordSignalHandler();
                        }
                        if (!hasOtherActiveSubscription(componentName)) {
                            deviceProtocol.Subscribe(address, new HashMap<String, String>());
                        }
                        subscribedComponents.put(componentName, subscribedComponents.get(componentName) + 1);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                } else {
                    throw new AgileNoResultException("Component not supported:" + componentName);
                }
            } else {
                throw new AgileNoResultException("Device not connected: " + deviceName);
            }
        } else {
            throw new AgileNoResultException("Protocol not supported: " + protocol);
        }
    }

    @Override
    public synchronized void Unsubscribe(String componentName) throws DBusException {
        if ((protocol.equals(DLINK_PROTOCOL_ID)) && (deviceProtocol != null)) {
            if (isConnected()) {
                if (isSensorSupported(componentName.trim())) {
                    try {
                        subscribedComponents.put(componentName, subscribedComponents.get(componentName) - 1);
                        if (!hasOtherActiveSubscription(componentName)) {
                            deviceProtocol.Unsubscribe(address, new HashMap<String, String>());
                        }
                        if (!hasOtherActiveSubscription()) {
                            removeNewRecordSignalHandler();
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                } else {
                    throw new AgileNoResultException("Component not supported:" + componentName);
                }
            } else {
                throw new AgileNoResultException("Device not connected: " + deviceName);
            }
        } else {
            throw new AgileNoResultException("Protocol not supported: " + protocol);
        }
    }

    @Override
    public void Connect() throws DBusException {
        deviceStatus = DeviceStatusType.CONNECTED;

        deviceProtocol.Connect(deviceID);
    }

    @Override
    public void Disconnect() throws DBusException {
        deviceStatus = DeviceStatusType.DISCONNECTED;

        deviceProtocol.Disconnect(deviceID);
    }

    @Override
    public StatusType Status() {
        return new StatusType(deviceStatus.toString());
    }

    protected boolean isConnected() {
        if (Status().getStatus().equals(DeviceStatusType.CONNECTED.toString()) || Status().getStatus().equals(DeviceStatusType.ON.toString())) {
            return true;
        }
        return false;
    }

    @Override
    protected boolean isSensorSupported(String sensorName) {
        return DLINK_COMPONENT.equals(sensorName);
    }

    @Override
    protected String formatReading(String sensorName, byte[] readData) {
        return new String(readData);
    }

    @Override
    protected String getComponentName(Map<String, String> profile) {
        return DLINK_COMPONENT;
    }

	@Override
  	public void Write(String componentName, String payload) {
	  if ((protocol.equals(DLINK_PROTOCOL_ID)) && (deviceProtocol != null)) {
		  if (isConnected()) {
				if (isSensorSupported(componentName.trim())) {
					logger.debug("Device Write: DLink devices do nothing on write");
				} else {
			        throw new AgileNoResultException("Componet not supported:" + componentName);
			    }
			} else {
				throw new AgileNoResultException("DLink Device not connected: " + deviceName);
			}
		} else {
			throw new AgileNoResultException("Protocol not supported: " + protocol);
		}
	}

    @Override
  	public void Execute(String command) {
    	logger.debug("Device. Execute not implemented");
	}

  	@Override
  	public List<String> Commands(){
    	logger.debug("Device. Commands not implemented");
    	return null;
  	}
}