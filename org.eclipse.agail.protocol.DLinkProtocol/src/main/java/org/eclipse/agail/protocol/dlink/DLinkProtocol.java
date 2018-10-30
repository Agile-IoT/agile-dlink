package org.eclipse.agail.protocol.dlink;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

import org.freedesktop.dbus.exceptions.DBusException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.eclipse.agail.Protocol;
import org.eclipse.agail.ProtocolManager;
import org.eclipse.agail.object.AbstractAgileObject;
import org.eclipse.agail.object.DeviceOverview;
import org.eclipse.agail.object.DeviceStatusType;
import org.eclipse.agail.object.StatusType;
import org.eclipse.agail.protocol.dlink.handler.DLinkMotionSensorHandler;
import java.nio.charset.Charset;

public class DLinkProtocol extends AbstractAgileObject implements Protocol {

  private final Logger logger = LoggerFactory.getLogger(DLinkProtocol.class);

  private static final String AGILE_DLINK_PROTOCOL_BUS_NAME = "org.eclipse.agail.protocol.DLink";

  private static final String AGILE_DLINK_PROTOCOL_BUS_PATH = "/org/eclipse/agail/protocol/DLink";

  /**
   * DBus bus path for found new device signal
   */
  private static final String AGILE_NEW_DEVICE_SIGNAL_PATH = "/org/eclipse/agail/NewDevice";

  /**
   * DBus bus path for for new record/data reading
   */
  private static final String AGILE_NEW_RECORD_SIGNAL_PATH = "/org/eclipse/agail/NewRecord";

  /**
   * Protocol name
   */
  private static final String PROTOCOL_NAME = "DLink Protocol";

  private static final String RUNNING = "RUNNING";

  private static final String DLINK = "DLINK";
   // Device status
  public static final String CONNECTED = "CONNECTED";

  public static final String AVAILABLE = "AVAILABLE";

  /**
   * Device list
   */
  protected List<DeviceOverview> deviceList = new ArrayList<DeviceOverview>();

  protected byte[] lastRecord;

  private ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);

  private ScheduledFuture discoveryFuture;
  
  private ScheduledFuture subscriptionFuture;

  private DLinkMotionSensorHandler sensorHandler;

  public DLinkProtocol() {
    System.setProperty("org.eclipse.jetty.util.log.class", "org.eclipse.jetty.util.log.StdErrLog");
    System.setProperty("org.eclipse.jetty.LEVEL", "OFF");

    try {
      dbusConnect(AGILE_DLINK_PROTOCOL_BUS_NAME, AGILE_DLINK_PROTOCOL_BUS_PATH, this);
    } catch (DBusException e) {
      e.printStackTrace();
    }

    logger.debug("DLink protocol started!");
  }

  public static void main(String[] args) {
    new DLinkProtocol();
  }

  public boolean isRemote() {
    return false;
  }

  public String Status() {
    return RUNNING;
  }

  public String Driver() {
    return DLINK;
  }

  public String Name() {
    return PROTOCOL_NAME;
  }

  public byte[] Data() {
    return lastRecord;
  }

  public List<DeviceOverview> Devices() {
    return deviceList;
  }

  public void Connect(String deviceAddress) throws DBusException {
    if(sensorHandler != null){
      sensorHandler.dispose();
    }

    sensorHandler = new DLinkMotionSensorHandler();
  }

  public void Disconnect(String deviceAddress) throws DBusException {
    if(sensorHandler != null){
      sensorHandler.dispose();
      sensorHandler = null;
    }
  }

  public String DiscoveryStatus() throws DBusException {
    if (discoveryFuture != null) {
      if (discoveryFuture.isCancelled()) {
        return "NONE";
      } else {
        return RUNNING;
      }
    }
    return "NONE";
  }

  public void StartDiscovery() throws DBusException {
    if (discoveryFuture != null) {
      logger.info("Discovery already running");
      return;
    }

    logger.info("Started discovery of DLink devices");
    Runnable task = () -> {
      if (deviceList.isEmpty()) {
        DeviceOverview deviceOverview = new DeviceOverview("[DLINK SENSOR ID HERE]", AGILE_DLINK_PROTOCOL_BUS_NAME, "DLINK", AVAILABLE);
        deviceList.add(deviceOverview);
        try {
          ProtocolManager.FoundNewDeviceSignal foundNewDevSig = new ProtocolManager.FoundNewDeviceSignal(AGILE_NEW_DEVICE_SIGNAL_PATH, deviceOverview);
          connection.sendSignal(foundNewDevSig);
        } catch (DBusException e) {
          e.printStackTrace();
        }
      }
    };

    discoveryFuture = executor.scheduleWithFixedDelay(task, 0, 5, TimeUnit.SECONDS);
  }

  public void StopDiscovery() {
    if (discoveryFuture != null) {
      discoveryFuture.cancel(true);
      discoveryFuture = null;
    }
  }

  public void Write(String deviceAddress, Map<String, String> profile, byte[] payload) throws DBusException {
  }

  public byte[] Read(String deviceAddress, Map<String, String> profile) throws DBusException {
    if(sensorHandler != null){
      lastRecord = sensorHandler.getStatus().getBytes(Charset.forName("UTF-8"));
    } else {
      lastRecord = "ok".getBytes(Charset.forName("UTF-8"));
    }
    
    return lastRecord;
  }

  public byte[] NotificationRead(String deviceAddress, Map<String, String> profile) throws DBusException {
    return null;
  }

  public void Subscribe(String deviceAddress, Map<String, String> profile) throws DBusException {
    if(subscriptionFuture == null){
      Runnable task = () ->{
        try {
          if(sensorHandler != null){
            lastRecord = sensorHandler.getStatus().getBytes(Charset.forName("UTF-8"));
          }
          Protocol.NewRecordSignal newRecordSignal = new Protocol.NewRecordSignal(AGILE_NEW_RECORD_SIGNAL_PATH,
              lastRecord, deviceAddress, profile);
          connection.sendSignal(newRecordSignal);
        } catch (Exception e) {
           e.printStackTrace();
        }
       };
       subscriptionFuture = executor.scheduleAtFixedRate(task, 0, 1, TimeUnit.SECONDS);
    }
  }

  public void Unsubscribe(String deviceAddress, Map<String, String> profile) throws DBusException {
    if(subscriptionFuture != null){
      subscriptionFuture.cancel(true);
      subscriptionFuture = null;
    }
  }

  public StatusType DeviceStatus(String deviceAddress) {
      return new StatusType(DeviceStatusType.CONNECTED.toString());
  }
}
