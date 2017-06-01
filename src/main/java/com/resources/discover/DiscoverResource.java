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

    // Create
    // this will accept a post request with a body containing a trip object
    // the trip object should contain the details you'd like in a trip and this will return matching destinations
    // and links to book (using "/discover/book")
    @RequestMapping(method = RequestMethod.POST, value = "/")
    public APIResponse discover(@RequestBody Trip tripRequest){
        //map parameters in the body to a trip object and pass to the service
        return service.discoverDestinations(tripRequest);
    }

    //This might be redundant depending on how the booking resource looks
    //This needs to accept url parameters with a tripId or it could just accept a trip object, your choice
    //It will then send the necessary info to the booking service(not sure if that exists yet or will even be created)
    @RequestMapping(method = RequestMethod.POST, value = "/book")
    public APIResponse discoverBook(){
        Trip tripRequest = new Trip();//placeholder - you'd actually just look up a trip by id, or accept a trip in the
        // body of the request
        return service.discover(tripRequest);
    }
}
