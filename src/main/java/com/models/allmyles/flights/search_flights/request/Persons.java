package com.models.allmyles.flights.search_flights.request;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Persons {
    String passengerType;
    short quantity;

    public String getPassengerType() {
        return passengerType;
    }

    public void setPassengerType(String passengerType) {
        this.passengerType = passengerType;
    }

    public short getQuantity() {
        return quantity;
    }

    public void setQuantity(short quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Persons{" +
                "passengerType='" + passengerType + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}