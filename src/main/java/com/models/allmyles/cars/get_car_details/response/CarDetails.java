package com.models.allmyles.cars.get_car_details.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.Arrays;

/**
 * Created by yovaliceroman on 5/9/17.
 */

@JsonIgnoreProperties(ignoreUnknown = true)
public class CarDetails {

    Location[] locations;
    String car_model;
    Package[] included;
    Package[] extras;
    String rules;

    public Location[] getLocations() {
        return locations;
    }

    public void setLocations(Location[] locations) {
        this.locations = locations;
    }

    public String getCar_model() {
        return car_model;
    }

    public void setCar_model(String car_model) {
        this.car_model = car_model;
    }

    public Package[] getIncluded() {
        return included;
    }

    public void setIncluded(Package[] included) {
        this.included = included;
    }

    public Package[] getExtras() {
        return extras;
    }

    public void setExtras(Package[] extras) {
        this.extras = extras;
    }

    public String getRules() {
        return rules;
    }

    public void setRules(String rules) {
        this.rules = rules;
    }

    @Override
    public String toString() {
        return "CarDetails{" +
                "locations='" + Arrays.toString(locations) + '\'' +
                "car_model='" + car_model + '\'' +
                "included='" + Arrays.toString(included) + '\'' +
                "extras='" + Arrays.toString(extras) + '\'' +
                "rules='" + rules +
                '}';
    }
}
