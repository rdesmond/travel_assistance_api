package com.resources.hotels;

import com.apis.APIResponse;
import com.models.allmyles.hotels.room_details.RoomDetailsRequest;
import com.services.hotels.RoomDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by yovaliceroman on 5/19/17.
 */

@RestController
@RequestMapping("/hotel")
public class RoomDetailsResource {

    @Autowired
    RoomDetailsService roomDetailsService;

    @RequestMapping(method = RequestMethod.POST, value = "/room")
    public APIResponse getRoomDetails(@RequestBody RoomDetailsRequest hotelRoomDetails) {
        APIResponse apiResponse = new APIResponse();
        try {
            apiResponse.setBody(roomDetailsService.roomDetails(hotelRoomDetails));
            apiResponse.setStatus(HttpStatus.OK);
        }catch (Exception e){
            apiResponse.setStatus(HttpStatus.INTERNAL_SERVER_ERROR);
            apiResponse.setMessage("Unable to retrive room details " + e.getMessage());
        }

        return apiResponse;
    }
}
