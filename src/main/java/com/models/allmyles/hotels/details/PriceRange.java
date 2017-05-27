package com.models.allmyles.hotels.details;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PriceRange {
    //Rate of the cheapest room at the hotel
    float minimum;

    //Rate of the most expensive room at the hotel
    float maximum;

    String currency;


    public float getMinimum() {
        return minimum;
    }

    public void setMinimum(float minimum) {
        this.minimum = minimum;
    }

    public float getMaximum() {
        return maximum;
    }

    public void setMaximum(float maximum) {
        this.maximum = maximum;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }


    @Override
    public String toString() {
        return "PriceRange{" +
                "currency='" + currency + '\'' +
                ", maximum=" + maximum +
                ", minimum=" + minimum +
                '}';
    }
}