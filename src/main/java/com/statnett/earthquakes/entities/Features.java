package com.statnett.earthquakes.entities;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Features {
    @Id
    private String id;
    private String type;

    @OneToOne(cascade = CascadeType.ALL)
    private Properties properties;

    @OneToOne(cascade = CascadeType.ALL)
    private Geometry geometry;

}
