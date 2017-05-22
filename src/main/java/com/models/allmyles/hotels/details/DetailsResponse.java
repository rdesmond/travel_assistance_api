package com.models.allmyles.hotels.details;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 Request

 GET /hotels/:hotel_id

 hotel_id is the ID of the TripHotel to get the details of
 */

@JsonIgnoreProperties(ignoreUnknown = true)
public class DetailsResponse {
    //root container
    HotelDetails hotel_details;


    public HotelDetails getHotel_details() {
        return hotel_details;
    }

    public void setHotel_details(HotelDetails hotel_details) {
        this.hotel_details = hotel_details;
    }


    @Override
    public String toString() {
        return "DetailsResponse{" +
                "hotel_details=" + hotel_details +
                '}';
    }
}