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

    // Reformat this to accept a body with parameters
    @RequestMapping("/")
    public APIResponse discover(){
        //map parameters in the body to a trip object and pass to the service
        Trip tripRequest = new Trip();//placeholder
        return service.discover(tripRequest);
    }
}
