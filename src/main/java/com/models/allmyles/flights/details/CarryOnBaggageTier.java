package com.models.allmyles.flights.details;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.Arrays;

/**
 These objects define the passenger’s options for taking cabin baggages on the flight. Each passenger can choose one of
 these for themselves.
 */

@JsonIgnoreProperties(ignoreUnknown = true)
public class CarryOnBaggageTier {
    //the ID for this baggage tier (this is used to refer to it when booking)
    String tier;

    //contains the price of the baggage tier
    Price price;

    //A basic description of the carry-on baggage’s size, e.g. Small cabin bag. Exact dimensions should be checked on
    // the airline’s website.
    String description;

    //contains the price of the baggage tier converted to the client’s preferred currencies
    Price[] price_in_preferred_currencies;


    public String getTier() {
        return tier;
    }

    public void setTier(String tier) {
        this.tier = tier;
    }

    public Price getPrice() {
        return price;
    }

    public void setPrice(Price price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Price[] getPrice_in_preferred_currencies() {
        return price_in_preferred_currencies;
    }

    public void setPrice_in_preferred_currencies(Price[] price_in_preferred_currencies) {
        this.price_in_preferred_currencies = price_in_preferred_currencies;
    }


    @Override
    public String toString() {
        return "CarryOnBaggageTier{" +
                "tier='" + tier + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                ", price_in_preferred_currencies=" + Arrays.toString(price_in_preferred_currencies) +
                '}';
    }
}