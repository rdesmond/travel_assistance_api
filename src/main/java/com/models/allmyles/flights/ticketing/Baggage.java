package com.models.allmyles.flights.ticketing;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Baggage {
    //The maximum quantity of baggage the passenger can bring along
    int quantity;

    //Units of measurement
    String unit;


    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }


    @Override
    public String toString() {
        return "Baggage{" +
                "quantity=" + quantity +
                ", unit='" + unit + '\'' +
                '}';
    }
}