package com.resources.discover;

import com.apis.APIResponse;
import com.models.internal.Trip;
import com.services.discover.DiscoverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author cass
 */

@RestController
@RequestMapping("/discover")
public class DiscoverResource {

    @Autowired
    private DiscoverService service;

    // This needs to accept a body with parameters
    // Make this a post request
    @RequestMapping("/")
    public APIResponse discover(){
        //map parameters in the body to a trip object and pass to the service
        Trip tripRequest = new Trip();//placeholder
        return service.discover(tripRequest);
    }

    //This might be redundant depending on how the booking resource looks

    //This needs to accept url parameters with a tripId
    //It will then send the necessary info to the booking service
    //Make this a post request
    @RequestMapping("/book")
    public APIResponse discoverBook(){
        Trip tripRequest = new Trip();//placeholder
        return service.discover(tripRequest);
    }
}
