package com.statnett.earthquakes.service;

import com.statnett.earthquakes.entities.EarthquakeData;
import com.statnett.earthquakes.respository.EarthquakeDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.reactive.function.client.WebClient;

@Component
public class DataLoadService  {

    @Autowired
    private WebClient webClient;

    @Autowired
    private EarthquakeDataRepository earthquakeDataRepository;

    private EarthquakeData getEarthquakeDataFromApi(){
        try{
            String uri = "https://earthquake.usgs.gov/earthquakes/feed/v1.0/summary/1.0_hour.geojson";
            EarthquakeData response = webClient.get().uri(uri).retrieve().bodyToMono(EarthquakeData.class).block();
            return response;
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;

    }


}
