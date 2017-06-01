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

    @Autowired
    private DestinationService service;

    /** This takes in a trip object and returns a list of possible destinations based on sub_region and tags
     *
     * I still need to figure out how to also return the information required to then book a trip
     *
     * @param tripRequest this is passed from the body of the request
     * @return an APIResponse with a list of possible destinations in the body
     */
    public APIResponse discoverDestinations(Trip tripRequest){
        // create an temporary list of all possible destinations
        List<Destination> possibleDestinations;
        //create a list to hold matching destinations
        List<Destination> matchingDestinations = new ArrayList<>();
        // turn tags into a List that can be iterated through
        List<TripTag> requestedTags = tripRequest.createTripTagList();
        try {
            //get possible destinations
            if (tripRequest.getSub_region() != null) {
                //get all the destinations in the requested region
                possibleDestinations = service.getBySubRegion(tripRequest.getSub_region());
            }else {
                //get all destinations
                possibleDestinations = service.getAll();
            }
            //iterate through the possible destinations and determine if any tags match
            for (Destination x : possibleDestinations){
                List<TripTag> destinationTags = x.createTripTagList();
                //removes any tags that do not match those requested
                destinationTags.retainAll(requestedTags);
                //if there are no matches, the destination is removed from the list
                if (destinationTags.size() >= 1){
                    matchingDestinations.add(x);
                }
            }
            // set response
            response.setBody(matchingDestinations);
            response.setStatus(HttpStatus.OK);
        }catch (Exception readError) {
            // set APIResponse status and message
            response.setStatus(HttpStatus.BAD_REQUEST);
            response.setMessage("Unable to process request: "+ readError.getMessage());
        }
        // return APIResponse object to resource
        return response;
    }


    public APIResponse discoverBook(Trip tripRequest){

        // this is a placeholder

        return response;
    }


}
