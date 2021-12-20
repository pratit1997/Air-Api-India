package com.example.AirQualityapi.dto;

import lombok.Data;

import java.time.ZonedDateTime;

@Data
public class StateData {
    int id;
    double pollutant_avg,pollutant_min,pollutant_max;
    String country,
        state,
        city,
        station,pollutant_unit,pollutant_id;
    String last_update;
}
