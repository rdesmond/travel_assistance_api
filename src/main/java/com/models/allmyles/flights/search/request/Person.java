package com.models.allmyles.flights.search.request;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Person {
    //One of ADT, CHD or INF
    String passengerType;

    //number of travelers of passengerType
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
        return "Person{" +
                "passengerType='" + passengerType + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}