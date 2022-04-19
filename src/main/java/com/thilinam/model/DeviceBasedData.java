package com.thilinam.model;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

public class DeviceBasedData implements Serializable {
    private String deviceId;
    private String timeStamp;
    private List<SensorBasedData> sensorData;

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public String getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
    }

    public List<SensorBasedData> getSensorData() {
        return sensorData;
    }

    public void setSensorData(List<SensorBasedData> sensorData) {
        this.sensorData = sensorData;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DeviceBasedData that = (DeviceBasedData) o;
        return deviceId.equals(that.deviceId) && timeStamp.equals(that.timeStamp) && sensorData.equals(that.sensorData);
    }

    @Override
    public int hashCode() {
        return Objects.hash(deviceId, timeStamp, sensorData);
    }

    @Override
    public String toString() {
        return "DeviceBasedData{" +
                "deviceId='" + deviceId + '\'' +
                ", timeStamp='" + timeStamp + '\'' +
                ", sensorData=" + sensorData +
                '}';
    }
}
