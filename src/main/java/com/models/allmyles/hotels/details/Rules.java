package com.models.allmyles.hotels.details;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Rules {
    String guarantee;
    String safety;
    String extra_occupants;
    String policy;
    String charges;
    String deposit;
    String meals;
    String stay;
    String tax;


    public String getGuarantee() {
        return guarantee;
    }

    public void setGuarantee(String guarantee) {
        this.guarantee = guarantee;
    }

    public String getSafety() {
        return safety;
    }

    public void setSafety(String safety) {
        this.safety = safety;
    }

    public String getExtra_occupants() {
        return extra_occupants;
    }

    public void setExtra_occupants(String extra_occupants) {
        this.extra_occupants = extra_occupants;
    }

    public String getPolicy() {
        return policy;
    }

    public void setPolicy(String policy) {
        this.policy = policy;
    }

    public String getCharges() {
        return charges;
    }

    public void setCharges(String charges) {
        this.charges = charges;
    }

    public String getDeposit() {
        return deposit;
    }

    public void setDeposit(String deposit) {
        this.deposit = deposit;
    }

    public String getMeals() {
        return meals;
    }

    public void setMeals(String meals) {
        this.meals = meals;
    }

    public String getStay() {
        return stay;
    }

    public void setStay(String stay) {
        this.stay = stay;
    }

    public String getTax() {
        return tax;
    }

    public void setTax(String tax) {
        this.tax = tax;
    }


    @Override
    public String toString() {
        return "Rules{" +
                "guarantee='" + guarantee + '\'' +
                ", safety='" + safety + '\'' +
                ", extra_occupants='" + extra_occupants + '\'' +
                ", policy='" + policy + '\'' +
                ", charges='" + charges + '\'' +
                ", deposit='" + deposit + '\'' +
                ", meals='" + meals + '\'' +
                ", stay='" + stay + '\'' +
                ", tax='" + tax + '\'' +
                '}';
    }
}