package com.resources.flights;

import com.apis.APIResponse;
import com.models.allmyles.flights.search.request.SearchFlights;
import com.services.flights.SearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

//POST /flights

@RestController
@RequestMapping("/flights")
public class SearchResource {

    @Autowired
    SearchService searchService;

    @RequestMapping(method = RequestMethod.POST)
    public APIResponse searchFlights(@RequestBody SearchFlights search){
        APIResponse response = new APIResponse();
        response.setBody(searchService.searchFlights(search));
        return response;
    }

    @RequestMapping(method = RequestMethod.GET, value = "/test")
    public String ryanText(){
        return "if this requires an access_token, we have proper oauth2";
    }
}