package com.example.AirQualityapi.Services;

import com.example.AirQualityapi.dto.InfoData;
import com.example.AirQualityapi.dto.StateData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;

@Service
public class DataProviderService {
    final  String url = "https://api.data.gov.in/resource/3b01bcb8-0b14-4abf-b6f2-c1bfd384ba69?api-key=579b464db66ec23bdd000001cdd3946e44ce4aad7209ff7b23ac571b&format=json&offset=0";
    @Autowired
    RestTemplate restTemplate;

     StateData getinfoData(String state) {
    InfoData infoData=restTemplate.getForObject(url,InfoData.class);
        return Arrays.stream(infoData.getRecords()).filter(e->
                e.getState().equalsIgnoreCase(state)).findAny().orElse(new StateData());
    }

}
