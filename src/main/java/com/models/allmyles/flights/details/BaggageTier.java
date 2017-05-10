package com.models.allmyles.flights.details;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.Arrays;

/**
 These objects define the passenger’s options for taking baggages on the flight. Each passenger can choose one of
 these for themselves.

 Note

 Keep in mind that while the tier ID’s value may seem closely related to the other fields, it’s not guaranteed to
 contain any semantic meaning at all.
 */

@JsonIgnoreProperties(ignoreUnknown = true)
public class BaggageTier {
    //the ID for this baggage tier (this is used to refer to it when booking)
    String tier;

    //contains the price of the baggage tier
    Price price;

    //the maximum weight of each piece of baggage a passenger can take in this tier in kg, can be an empty array if
    // there’s no limit. Having multiple items in this array means that for the specified price, the passenger can
    // check in as many baggages as there are items in the array. Can be an empty list if data is present in the total
    // field.
    Float[] max_weights;

    //Some airlines don’t limit the weights of each bag, only the total weight of all the bags, and the number of bags.
    Total total;

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

    public Float[] getMax_weights() {
        return max_weights;
    }

    public void setMax_weights(Float[] max_weights) {
        this.max_weights = max_weights;
    }

    public Total getTotal() {
        return total;
    }

    public void setTotal(Total total) {
        this.total = total;
    }

    public Price[] getPrice_in_preferred_currencies() {
        return price_in_preferred_currencies;
    }

    public void setPrice_in_preferred_currencies(Price[] price_in_preferred_currencies) {
        this.price_in_preferred_currencies = price_in_preferred_currencies;
    }


    @Override
    public String toString() {
        return "BaggageTier{" +
                "tier='" + tier + '\'' +
                ", price=" + price +
                ", max_weights=" + Arrays.toString(max_weights) +
                ", total=" + total +
                ", price_in_preferred_currencies=" + Arrays.toString(price_in_preferred_currencies) +
                '}';
    }
}