package com.thilinam.model;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

public class SensorBasedData implements Serializable {
    private String sensorId;
    private List<String> sensorData;

    public String getSensorId() {
        return sensorId;
    }

    public void setSensorId(String sensorId) {
        this.sensorId = sensorId;
    }

    public List<String> getSensorData() {
        return sensorData;
    }

    public void setSensorData(List<String> sensorData) {
        this.sensorData = sensorData;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SensorBasedData that = (SensorBasedData) o;
        return sensorId.equals(that.sensorId) && sensorData.equals(that.sensorData);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sensorId, sensorData);
    }

    @Override
    public String toString() {
        return "SensorBasedData{" +
                "sensorId='" + sensorId + '\'' +
                ", sensorData=" + sensorData +
                '}';
    }

}
