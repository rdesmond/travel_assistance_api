package com.models.allmyles.cars.get_car_details.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by yovaliceroman on 5/9/17.
 */

@JsonIgnoreProperties(ignoreUnknown = true)
public class DetailsResults {

    CarDetails car_details;

    public CarDetails getCar_details() {
        return car_details;
    }

    public void setCar_details(CarDetails car_details) {
        this.car_details = car_details;
    }

    @Override
    public String toString() {
        return "DetailsResults{" +
                "car_details='" + car_details +
                '}';
    }
}
