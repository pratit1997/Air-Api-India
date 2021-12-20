package com.example.AirQualityapi.dto;

import lombok.Data;

import java.util.List;
@Data
public class AlertAir {
    public static String getAlertLevel() {
        return alertLevel;
    }

    public  void setAlertLevel(String alertLevel) {
        AlertAir.alertLevel = alertLevel;
    }

    public List<String> getMeasuresToBeTaken() {
        return measuresToBeTaken;
    }

    public void setMeasuresToBeTaken(List<String> measuresToBeTaken) {
        this.measuresToBeTaken = measuresToBeTaken;
    }

    public StateData getOverall() {
        return overall;
    }

    public void setOverall(StateData overall) {
        this.overall = overall;
    }

    static  String alertLevel;        //red,green,orange
    List<String> measuresToBeTaken;
        public StateData overall;
}
