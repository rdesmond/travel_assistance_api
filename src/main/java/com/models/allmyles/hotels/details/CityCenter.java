package com.models.allmyles.hotels.details;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CityCenter {
    double distance;
    String unit;


    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }


    @Override
    public String toString() {
        return "CityCenter{" +
                "distance=" + distance +
                ", unit='" + unit + '\'' +
                '}';
    }
}