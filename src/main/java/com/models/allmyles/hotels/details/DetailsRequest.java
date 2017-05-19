package com.models.allmyles.hotels.details;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by yovaliceroman on 5/19/17.
 */

@JsonIgnoreProperties(ignoreUnknown = true)
public class DetailsRequest {

    String hotel_id;

    public String getHotel_id() {
        return hotel_id;
    }

    public void setHotel_id(String hotel_id) {
        this.hotel_id = hotel_id;
    }

    @Override
    public String toString() {
        return "DetailsRequest{" +
                "hotel_id='" + hotel_id +
                '}';
    }
}
