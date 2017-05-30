package com.services.discover;

import com.apis.APIResponse;
import com.models.TripTag;
import com.models.internal.Destination;
import com.models.internal.Trip;
import com.services.DestinationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

/**
 * @author cass
 */
@Service
public class DiscoverService {

    @Autowired
    private APIResponse response;

    // I haven't created this class yet
    @Autowired
    private DestinationService service;

    // format to accept parameters from the resource (as a trip object?)
    public APIResponse discover(Trip tripRequest){
//        try {
//            //get all the destinations
//            List<Destination> destinations = service.getAll();
//            //iterate through the list to compare TripTag enums
//            for (Destination x : destinations){
//                List<TripTag> tags = x.getTags();
//                //compare these tags to those
//            }
//
//            response.setBody(destinations);
//            response.setStatus(HttpStatus.OK);
//        }catch (Exception readError) {
//            // set APIResponse status and message
//            response.setStatus(HttpStatus.BAD_REQUEST);
//            response.setMessage("Unable to process request: "+ readError.getMessage());
//        }
//        // return APIResponse object to resource
        return response;
    }
}
