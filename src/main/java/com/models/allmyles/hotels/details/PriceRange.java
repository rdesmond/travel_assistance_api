package com.models.allmyles.hotels.details;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PriceRange {
    //Rate of the cheapest room at the hotel
    Float minimum;

    //Rate of the most expensive room at the hotel
    Float maximum;

    String currency;


    public Float getMinimum() {
        return minimum;
    }

    public void setMinimum(Float minimum) {
        this.minimum = minimum;
    }

    public Float getMaximum() {
        return maximum;
    }

    public void setMaximum(Float maximum) {
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
                "minimum=" + minimum +
                ", maximum=" + maximum +
                ", currency='" + currency + '\'' +
                '}';
    }
}