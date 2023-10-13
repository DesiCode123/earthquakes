package com.statnett.earthquakes.respository;

import com.statnett.earthquakes.entities.EarthquakeData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EarthquakeDataRepository  extends JpaRepository<EarthquakeData,Long> {
}
