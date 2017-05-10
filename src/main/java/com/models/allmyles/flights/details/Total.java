package com.models.allmyles.flights.details;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Total {
    //maximum summed weight of all the bags the passenger can take
    Float weight;

    //number of bags that the passenger can take
    int number_of_bags;


    public Float getWeight() {
        return weight;
    }

    public void setWeight(Float weight) {
        this.weight = weight;
    }

    public int getNumber_of_bags() {
        return number_of_bags;
    }

    public void setNumber_of_bags(int number_of_bags) {
        this.number_of_bags = number_of_bags;
    }


    @Override
    public String toString() {
        return "Total{" +
                "weight=" + weight +
                ", number_of_bags=" + number_of_bags +
                '}';
    }
}