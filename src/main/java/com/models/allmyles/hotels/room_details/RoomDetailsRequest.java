package com.models.allmyles.hotels.room_details;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by yovaliceroman on 5/19/17.
 */

@JsonIgnoreProperties(ignoreUnknown = true)
public class RoomDetailsRequest {

    String hotel_id;
    String room_id;

    public String getHotel_id() {
        return hotel_id;
    }

    public void setHotel_id(String hotel_id) {
        this.hotel_id = hotel_id;
    }

    public String getRoom_id() {
        return room_id;
    }

    public void setRoom_id(String room_id) {
        this.room_id = room_id;
    }

    @Override
    public String toString() {
        return "RoomDetailsRequest{" +
                "hotel_id='" + hotel_id +
                "room_id='" +room_id + '\'' +
                '}';
    }
}
