package com.models.allmyles.flights.search.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ServiceFeeInPreferredCurrencies {
    String currency;
    Float service_fee;


    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Float getService_fee() {
        return service_fee;
    }

    public void setService_fee(Float service_fee) {
        this.service_fee = service_fee;
    }


    @Override
    public String toString() {
        return "ServiceFeeInPreferredCurrencies{" +
                "currency='" + currency + '\'' +
                ", service_fee=" + service_fee +
                '}';
    }
}
