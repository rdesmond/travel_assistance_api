package com.resources.flights;

import com.apis.APIResponse;
import com.models.allmyles.flights.search.request.SearchFlights;
import com.services.flights.SearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

//POST /flights

@RestController
public class SearchResource {

    @Autowired
    SearchService searchService;

    @RequestMapping(method = RequestMethod.POST, value = "/flights")
    public APIResponse searchFlights(@RequestBody SearchFlights search){
        APIResponse response = new APIResponse();
        response.setBody(searchService.searchFlights(search));
        return response;
    }
}