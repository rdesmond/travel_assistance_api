package com.resources.hotels;

import com.apis.APIResponse;
import com.models.allmyles.hotels.search.SearchRequest;
import com.services.hotels.HotelSearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by yovaliceroman on 5/18/17.
 */

@RestController
@RequestMapping("/hotels")
public class HotelSearchResource {

    @Autowired
    HotelSearchService hotelSearchService;

    @RequestMapping(method = RequestMethod.POST, value = "/search")
    public APIResponse searchHotelResponse(@RequestBody SearchRequest search) {
        APIResponse apiResponse = new APIResponse();
        try {
            apiResponse.setBody(hotelSearchService.searchHotels(search));
            apiResponse.setStatus(HttpStatus.OK);
        } catch (Exception e){
            apiResponse.setStatus(HttpStatus.INTERNAL_SERVER_ERROR);
            apiResponse.setMessage("Unable to retrive hotels" + e.getMessage());
        }
        return apiResponse;
    }
}
