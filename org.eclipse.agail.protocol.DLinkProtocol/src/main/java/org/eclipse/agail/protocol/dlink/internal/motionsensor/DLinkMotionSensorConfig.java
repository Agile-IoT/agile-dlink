package org.eclipse.agail.protocol.dlink.internal.motionsensor;

public class DLinkMotionSensorConfig {
    public static final String IP_ADDRESS = "ipAddress";
    public static final String PIN = "pin";

    public String ipAddress;
    public String pin;

    public DLinkMotionSensorConfig(String ip, String pin) {
        this.ipAddress = ip;
        this.pin = pin;
    }
}
