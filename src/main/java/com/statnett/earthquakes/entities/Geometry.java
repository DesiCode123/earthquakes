package com.statnett.earthquakes.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
public class Geometry {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private String type;

    @ElementCollection
    private List<Double> coordinates;

}
