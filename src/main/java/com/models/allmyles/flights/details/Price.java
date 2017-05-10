package com.models.allmyles.flights.details;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Price {
    //the amount of money in the currency below
    Float amount;

    //the currency of the amount specified, can be null when the amount is zero
    String currency;


    public Float getAmount() {
        return amount;
    }

    public void setAmount(Float amount) {
        this.amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }


    @Override
    public String toString() {
        return "Price{" +
                "amount=" + amount +
                ", currency='" + currency + '\'' +
                '}';
    }
}