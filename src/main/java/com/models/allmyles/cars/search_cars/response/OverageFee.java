package com.models.allmyles.cars.search_cars.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by yovaliceroman on 5/9/17.
 */

@JsonIgnoreProperties(ignoreUnknown = true)
public class OverageFee {

    String unit;
    int included_distance;
    float amount;
    String currency;

    public OverageFee(){}

    public OverageFee(String unit, int included_distance, float amount, String currency) {
        this.unit = unit;
        this.included_distance = included_distance;
        this.amount = amount;
        this.currency = currency;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public int getInclude_distance() {
        return included_distance;
    }

    public void setInclude_distance(int include_distance) {
        this.included_distance = include_distance;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
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
        return "OverageFee{" +
                "currency='" + currency + '\'' +
                ", amount='" + amount + '\'' +
                ", unit='" + unit + '\'' +
                ", included_distance='" + included_distance +
                '}';
    }
}