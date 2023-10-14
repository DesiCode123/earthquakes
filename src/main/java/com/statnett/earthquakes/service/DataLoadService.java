package com.statnett.earthquakes.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.statnett.earthquakes.entities.EarthquakeData;
import com.statnett.earthquakes.respository.EarthquakeDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class DataLoadService  {
    @Autowired
    private ObjectMapper objectMapper;

    @Autowired
    private WebClient webClient;

    @Autowired
    private EarthquakeDataRepository earthquakeDataRepository;

    public String getEarthquakeDataFromApi(){
        try{
            String uri = "https://earthquake.usgs.gov/earthquakes/feed/v1.0/summary/1.0_hour.geojson";
            String jasonResponse = webClient.get()
                    .uri(uri)
                    .retrieve()
                    .bodyToMono(String.class)
                    .block();

            EarthquakeData earthquakeData = objectMapper.readValue(jasonResponse,EarthquakeData.class);

            earthquakeDataRepository.save(earthquakeData);
            return jasonResponse;
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;

    }



}
