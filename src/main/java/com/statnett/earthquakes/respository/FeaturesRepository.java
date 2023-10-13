package com.statnett.earthquakes.respository;

import com.statnett.earthquakes.entities.Features;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FeaturesRepository extends JpaRepository<Features,Long> {

}
