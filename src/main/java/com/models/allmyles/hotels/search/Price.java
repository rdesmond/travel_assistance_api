package com.models.allmyles.hotels.search;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Price {
    float amount;

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