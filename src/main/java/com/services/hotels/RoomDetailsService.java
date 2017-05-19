package com.services.hotels;

import com.apis.GenericRequestHandler;
import com.apis.ThirdPartyRequest;
import com.models.allmyles.hotels.room_details.RoomDetailsRequest;
import com.models.allmyles.hotels.room_details.RoomDetailsResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;

/**
 * Created by yovaliceroman on 5/19/17.
 */

@Service
public class RoomDetailsService {

    @Autowired
    GenericRequestHandler handler;

    public RoomDetailsResponse roomDetails(RoomDetailsRequest hotelRoomDetails){

        HttpHeaders headers = new HttpHeaders();
        headers.add("X-Auth-Token", "af327616-9978");
        headers.add("Content-Type", "application/json");
        headers.add("Cookie", "Cookie");
        ThirdPartyRequest request = new ThirdPartyRequest(
                "https://dev.allmyles.com/v2.0/hotels/" + hotelRoomDetails.getHotel_id() +
                "/rooms/" + hotelRoomDetails.getRoom_id(), HttpMethod.GET);

        return (RoomDetailsResponse) handler.callAPI(request, hotelRoomDetails , RoomDetailsResponse.class, headers);

    }
}
