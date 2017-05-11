package com.models.allmyles.hotels.room_details;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.Arrays;

@JsonIgnoreProperties(ignoreUnknown = true)
public class HotelRoomDetails {
    //Contains an associative array
    Rules rules;

    RoomPrice price;

    //Contains what services or extras are included in the price.
    String[] includes;


    public Rules getRules() {
        return rules;
    }

    public void setRules(Rules rules) {
        this.rules = rules;
    }

    public RoomPrice getPrice() {
        return price;
    }

    public void setPrice(RoomPrice price) {
        this.price = price;
    }

    public String[] getIncludes() {
        return includes;
    }

    public void setIncludes(String[] includes) {
        this.includes = includes;
    }


    @Override
    public String toString() {
        return "HotelRoomDetails{" +
                "rules=" + rules +
                ", price=" + price +
                ", includes=" + Arrays.toString(includes) +
                '}';
    }
}