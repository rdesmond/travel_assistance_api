package com.models.allmyles.hotels.search;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.Arrays;

/**
 Response Codes

 404 ‘No hotels available’
 */

@JsonIgnoreProperties(ignoreUnknown = true)
public class SearchResponse {
    //root container
    Hotel[] hotelResultSet;


    public Hotel[] getHotelResultSet() {
        return hotelResultSet;
    }

    public void setHotelResultSet(Hotel[] hotelResultSet) {
        this.hotelResultSet = hotelResultSet;
    }


    @Override
    public String toString() {
        return "SearchResponse{" +
                "hotelResultSet=" + Arrays.toString(hotelResultSet) +
                '}';
    }
}