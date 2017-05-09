package com.models.allmyles.flights.search.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PriceChargedByProvider {
    String currency;
    Float total_fare;
    Float ticketing_fee;


    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Float getTotal_fare() {
        return total_fare;
    }

    public void setTotal_fare(Float total_fare) {
        this.total_fare = total_fare;
    }

    public Float getTicketing_fee() {
        return ticketing_fee;
    }

    public void setTicketing_fee(Float ticketing_fee) {
        this.ticketing_fee = ticketing_fee;
    }


    @Override
    public String toString() {
        return "PriceChargedByProvider{" +
                "currency='" + currency + '\'' +
                ", total_fare=" + total_fare +
                ", ticketing_fee=" + ticketing_fee +
                '}';
    }
}