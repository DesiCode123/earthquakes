package com.statnett.earthquakes.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Properties {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Double mag;
    private String place;
    private Long time;
    private Long updated;
    private Integer tz;
    private String url;
    private String detail;
    private Integer felt;
    private Double cdi; //  decimal values; using Double since it can be null
    private Double mmi;
    private String alert;
    private String status;
    private Integer tsunami;
    private Integer sig;
    private String net;
    private String code;
    private String ids;
    private String sources;
    private String types;
    private Integer nst;
    private Double dmin;
    private Double rms;
    private Integer gap;
    private String magType;
    private String type;
    private String title;
}
