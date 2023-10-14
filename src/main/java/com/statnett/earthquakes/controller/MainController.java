package com.statnett.earthquakes.controller;

import com.statnett.earthquakes.entities.EarthquakeData;
import com.statnett.earthquakes.service.DataLoadService;
import com.statnett.earthquakes.service.EarthquakeReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MainController {
    @Autowired
    private EarthquakeReportService earthquakeReportService;




        @GetMapping("/getFeaturesType/{id}")
    public List<String> getFeaturesType(@PathVariable Long id){
        return earthquakeReportService.getTypeFromFeatures(id);
    }
}

