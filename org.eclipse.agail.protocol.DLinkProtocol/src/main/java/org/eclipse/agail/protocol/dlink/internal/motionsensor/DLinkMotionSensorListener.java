package org.eclipse.agail.protocol.dlink.internal.motionsensor;

public interface DLinkMotionSensorListener {
    void motionDetected();
    void sensorStatus(final DLinkMotionSensorCommunication.DeviceStatus status);
}
