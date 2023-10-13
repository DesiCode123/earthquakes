package com.statnett.earthquakes.respository;

import com.statnett.earthquakes.entities.Metadata;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MetadataRepository extends JpaRepository<Metadata,Long> {
}
