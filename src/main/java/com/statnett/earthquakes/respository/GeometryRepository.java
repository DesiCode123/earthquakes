package com.statnett.earthquakes.respository;

import com.statnett.earthquakes.entities.Geometry;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GeometryRepository extends JpaRepository<Geometry,Long> {
}
