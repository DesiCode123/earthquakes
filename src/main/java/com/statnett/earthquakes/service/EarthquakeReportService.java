package com.statnett.earthquakes.service;

import com.statnett.earthquakes.entities.EarthquakeData;
import com.statnett.earthquakes.respository.EarthquakeDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class EarthquakeReportService {

    @Autowired
    private EarthquakeDataRepository earthquakeDataRepository;
    public List<String> getTypeFromFeatures(Long id) {
        try {
            EarthquakeData earthquakeData = earthquakeDataRepository.findById(id)
                    .orElseThrow(() -> new RuntimeException("Erthquake data not found"));

            return earthquakeData.getFeatures().stream()
                    .map(features -> features.getType())
                    .collect(Collectors.toList());
        } catch (Exception e) {
            throw new RuntimeException("Unable to fetch the data");
        }
    }


}
