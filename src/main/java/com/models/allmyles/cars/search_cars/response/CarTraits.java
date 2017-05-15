package com.models.allmyles.cars.search_cars.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by yovaliceroman on 5/9/17.
 */

@JsonIgnoreProperties(ignoreUnknown = true)
public class CarTraits {

    String classValue;
    String type;
    String transmission;
    boolean air_conditioning;

    public CarTraits(){}

    public CarTraits(String classValue, String type, String transmission, boolean air_conditioning) {
        this.classValue = classValue;
        this.type = type;
        this.transmission = transmission;
        this.air_conditioning = air_conditioning;
    }

    @JsonProperty("class")
    public String getClassValue() {
        return classValue;
    }

    @JsonProperty("class")
    public void setClassValue(String classValue) {
        this.classValue = classValue;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public boolean isAir_conditioning() {
        return air_conditioning;
    }

    public void setAir_conditioning(boolean air_conditioning) {
        this.air_conditioning = air_conditioning;
    }

    @Override
    public String toString() {
        return "CarTraits{" +
                "transmission='" + transmission + '\'' +
                ", air_conditioning='" + air_conditioning + '\'' +
                ", type='" + type + '\'' +
                ", classValue='" + classValue +
                '}';
    }
}