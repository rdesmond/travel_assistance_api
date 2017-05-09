package com.models.allmyles.flights.search.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class TotalFareInPreferredCurrencies {
    String currency;
    Float total_fare;


    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Float getTicketing_fee() {
        return total_fare;
    }

    public void setTicketing_fee(Float ticketing_fee) {
        this.total_fare = ticketing_fee;
    }


    @Override
    public String toString() {
        return "TotalFareInPreferredCurrencies{" +
                "currency='" + currency + '\'' +
                ", ticketing_fee=" + total_fare +
                '}';
    }
}