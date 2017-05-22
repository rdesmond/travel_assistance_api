package com.models.allmyles.hotels.room_details;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 Request

 GET /hotels/:hotel_id/rooms/:room_id

 hotel_id is the ID of the TripHotel the room belongs to, room_id is the ID of the Room to get the details of.
 */

@JsonIgnoreProperties(ignoreUnknown = true)
public class RoomDetailsResponse {
    //root container
    HotelRoomDetails hotel_room_details;


    public HotelRoomDetails getHotel_room_details() {
        return hotel_room_details;
    }

    public void setHotel_room_details(HotelRoomDetails hotel_room_details) {
        this.hotel_room_details = hotel_room_details;
    }


    @Override
    public String toString() {
        return "RoomDetailsResponse{" +
                "hotel_room_details=" + hotel_room_details +
                '}';
    }
}