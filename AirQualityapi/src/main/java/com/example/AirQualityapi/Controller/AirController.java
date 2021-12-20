package com.example.AirQualityapi.Controller;

import com.example.AirQualityapi.Services.AirService;
import com.example.AirQualityapi.dto.AlertAir;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/india")
public class AirController {
 @Autowired
    AirService airService;
    @RequestMapping("{state}")
    AlertAir getAirData(@PathVariable String state){
        return airService.getAirServicesState(state);
    }
    @GetMapping("/")
            String demo(){
                return "api call";
    }

}
