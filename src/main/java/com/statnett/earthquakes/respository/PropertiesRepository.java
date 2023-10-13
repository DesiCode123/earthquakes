package com.statnett.earthquakes.respository;

import com.statnett.earthquakes.entities.Properties;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PropertiesRepository extends JpaRepository<Properties,Long> {
}
