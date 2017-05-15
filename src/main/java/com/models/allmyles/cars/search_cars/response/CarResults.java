package com.models.allmyles.cars.search_cars.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.Arrays;

/**
 * Created by yovaliceroman on 5/9/17.
 */

@JsonIgnoreProperties(ignoreUnknown = true)
public class CarResults {

    Car[] car_results;

    public CarResults(){}

    public CarResults(Car[] car_results) {
        this.car_results = car_results;
    }

    public Car[] getCar_results() {
        return car_results;
    }

    public void setCar_results(Car[] car_results) {
        this.car_results = car_results;
    }

    @Override
    public String toString() {
        return "CarResults{" +
                "car_results='" + Arrays.toString(car_results) +
                '}';
    }
}
