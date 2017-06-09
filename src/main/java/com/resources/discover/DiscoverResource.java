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

    /** This will accept a post request with a body containing a trip object
     * the trip object should contain the details you'd like in a trip and this will return matching destinations
     *
     * I still need to figure out how to also return the information required to then book a trip
     *
     * @param tripRequest
     * @return APIResponse with a body containing matching destinations
     */
    @RequestMapping(method = RequestMethod.POST, value = "/destinations")
    public APIResponse discoverDestinations(@RequestBody Trip tripRequest){
        //map parameters in the body to a trip object and pass to the service
        return service.discoverDestinations(tripRequest);
    }


    /**
     * This is a placeholder and it might be redundant or need to be totally different
     * This could accept url parameters with a tripId or it could just accept a trip object, your choice
     * It would then send the necessary info to the booking service
     * (not sure if that exists yet or will even be created - otherwise it would take the place of the booking service)
     *
     * @return
     */
    @RequestMapping(method = RequestMethod.POST, value = "/")
    public APIResponse discover(@RequestBody Trip trip){
        return service.discover(trip);
    }
}
