package com.resources.hotels;

import com.apis.APIResponse;
import com.models.allmyles.hotels.details.DetailsRequest;
import com.models.allmyles.hotels.search.Hotel;
import com.services.hotels.HotelDetailsService;
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
@RequestMapping("/hotels")
public class HotelDetailsResource {

    @Autowired
    HotelDetailsService hotelDetailsService;

    @RequestMapping(method = RequestMethod.POST, value = "/details")
    public APIResponse getHotelsDetails(@RequestBody DetailsRequest detailsRequest) {
        APIResponse apiResponse = new APIResponse();
        try {
            apiResponse.setBody(hotelDetailsService.getHotels(detailsRequest));
            apiResponse.setStatus(HttpStatus.OK);
        }catch (Exception e){
            apiResponse.setStatus(HttpStatus.INTERNAL_SERVER_ERROR);
            apiResponse.setMessage("Unable to retrive hotels details " + e.getMessage());
        }

        return apiResponse;
    }
}
