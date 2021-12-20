package com.example.AirQualityapi.Services;

import com.example.AirQualityapi.dto.AlertAir;
import com.example.AirQualityapi.dto.StateData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class AirService {
    @Autowired
    DataProviderService dataProviderService;
AlertAir alertAir=new AlertAir();

    public AlertAir getAirServicesState( String states) {
        StateData stateData=dataProviderService.getinfoData(states);
        alertAir.setOverall(stateData);
        if(stateData.getPollutant_max()<100){
            alertAir.setAlertLevel("GREEN");
            alertAir.setMeasuresToBeTaken(Arrays.asList("Every this is Normal"));
        }else if(stateData.getPollutant_min()>100&& stateData.getPollutant_max()<200){
            alertAir.setAlertLevel("Orange");
            alertAir.setMeasuresToBeTaken(Arrays.asList("take some prevention measures to make sure the situation doesn't get worse"));
        }else{
            alertAir.setAlertLevel("RED");
            alertAir.setMeasuresToBeTaken(Arrays.asList("The state is on red alert and need strict meauseres "));
        }
        return alertAir;
    }
}
