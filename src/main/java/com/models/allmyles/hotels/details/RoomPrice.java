package com.models.allmyles.hotels.details;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class RoomPrice {
    Float amount;

    //One of ‘day’ or ‘trip’, specifies which duration the price covers
    String covers;

    //True if the rate is not going to be the same for each day during the occupant’s stay. In this case, the above
    // given amount is the highest one during the trip.
    boolean rate_varies;


    public Float getAmount() {
        return amount;
    }

    public void setAmount(Float amount) {
        this.amount = amount;
    }

    public String getCovers() {
        return covers;
    }

    public void setCovers(String covers) {
        this.covers = covers;
    }

    public boolean isRate_varies() {
        return rate_varies;
    }

    public void setRate_varies(boolean rate_varies) {
        this.rate_varies = rate_varies;
    }


    @Override
    public String toString() {
        return "RoomPrice{" +
                "amount=" + amount +
                ", covers='" + covers + '\'' +
                ", rate_varies=" + rate_varies +
                '}';
    }
}