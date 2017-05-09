package com.models.allmyles.flights.search.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class TicketingFeeInPreferredCurrencies {
    String currency;
    Float ticketing_fee;


    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Float getTicketing_fee() {
        return ticketing_fee;
    }

    public void setTicketing_fee(Float ticketing_fee) {
        this.ticketing_fee = ticketing_fee;
    }


    @Override
    public String toString() {
        return "TotalFareInPreferredCurrencies{" +
                "currency='" + currency + '\'' +
                ", ticketing_fee=" + ticketing_fee +
                '}';
    }
}