package com.statnett.earthquakes.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class EarthquakeData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String type;

    @OneToOne(cascade = CascadeType.ALL)
    private Metadata metadata;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Features> features;

    @ElementCollection
    private List<Double> bbox;

}
