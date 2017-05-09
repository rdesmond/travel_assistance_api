package com.models.allmyles.flights.search.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class FareInPreferredCurrencies {
    String currency;
    Float fare;
    Float tax;


    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Float getFare() {
        return fare;
    }

    public void setFare(Float fare) {
        this.fare = fare;
    }

    public Float getTax() {
        return tax;
    }

    public void setTax(Float tax) {
        this.tax = tax;
    }


    @Override
    public String toString() {
        return "FareInPreferredCurrencies{" +
                "currency='" + currency + '\'' +
                ", fare=" + fare +
                ", tax=" + tax +
                '}';
    }
}
