package com.services;

import com.apis.APIResponse;
import com.mappers.TripMapper;
import com.models.internal.Trip;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

/**Receives the Trip or TripId from the resource, passes to the mapper, and returns an APIResponse.
 * Each method will check if the trip exists and respond accordingly and handle any exceptions.
 * @author cass
 */

@Service
public class TripService {
    @Autowired
    private TripMapper mapper;
    @Autowired
    private APIResponse response;

    // Create
    public APIResponse addNew(Trip trip){
        try{
            // test if trip already exists
            if (exists(trip)){
                response.setStatus(HttpStatus.BAD_REQUEST);
                response.setMessage("Trip already exists");
            }else {
                // create the trip in the DB by passing the trip object from the resource to the mapper
                mapper.addNew(trip);
                // set APIResponse body, status, and message
                response.setBody(mapper.getById(trip.getId()));
                response.setStatus(HttpStatus.CREATED);
                response.setMessage("Successfully created TripId: " + trip.getId());
            }
        } catch (Exception createError) {
            // set APIResponse status and message
            response.setStatus(HttpStatus.BAD_REQUEST);
            response.setMessage("Unable to process request: "+ createError.getMessage());
        }
        // return APIResponse object to resource
        return response;
    }

    // Read
    public APIResponse getAll(){
        try {
            // make sure there are trips
            ArrayList<Trip> trips = mapper.getAll();
            // set APIResponse body, status, and message
            if (trips.size() == 0) {
                response.setStatus(HttpStatus.NO_CONTENT);
                response.setMessage("No trips found");
            } else {
                response.setBody(trips);
                response.setStatus(HttpStatus.OK);
            }
        }catch (Exception readError) {
            // set APIResponse status and message
            response.setStatus(HttpStatus.BAD_REQUEST);
            response.setMessage("Unable to process request: "+ readError.getMessage());
        }
        // return APIResponse object to resource
        return response;
    }
    public APIResponse getById(int id){
        try {
            // make sure trip exists
            if (exists(mapper.getById(id))) {
                // set APIResponse body, status, and message
                response.setBody(mapper.getById(id));
                response.setStatus(HttpStatus.OK);
            }else {
                response.setStatus(HttpStatus.BAD_REQUEST);
                response.setMessage("Trip does not exist");
            }
        }catch (Exception readError) {
            // set APIResponse status and message
            response.setStatus(HttpStatus.BAD_REQUEST);
            response.setMessage("Unable to process request: "+ readError.getMessage());
        }
        // return APIResponse object to resource
        return response;
    }
    public APIResponse getByUserId(int user_id){
        try {
            // make sure there are trips
            ArrayList<Trip> trips = mapper.getByUserId(user_id);
            // set APIResponse body, status, and message
            if (trips.size() == 0) {
                response.setStatus(HttpStatus.NO_CONTENT);
                response.setMessage("No trips found");
            } else {
                response.setBody(trips);
                response.setStatus(HttpStatus.OK);
            }
        }catch (Exception readError) {
            // set APIResponse status and message
            response.setStatus(HttpStatus.BAD_REQUEST);
            response.setMessage("Unable to process request: "+ readError.getMessage());
        }
        // return APIResponse object to resource
        return response;
    }

    // Update
    public APIResponse updateById(Trip trip){
        try{
            // make sure trip exists
            if (exists(trip)) {
                // update the trip in the DB by passing the trip object from the resource to the mapper
                int id = mapper.updateById(trip);
                // set APIResponse body, status, and message
                response.setBody(mapper.getById(id));
                response.setStatus(HttpStatus.OK);
                response.setMessage("Successfully updated TripId: "+ trip.getId());
            } else {
                response.setStatus(HttpStatus.BAD_REQUEST);
                response.setMessage("Trip does not exist");
            }
        } catch (Exception updateError) {
            // set APIResponse status and message
            response.setStatus(HttpStatus.BAD_REQUEST);
            response.setMessage("Unable to process request: "+ updateError.getMessage());
        }
        // return APIResponse object to resource
        return response;
    }

    // Delete
    public APIResponse deleteById(int id){
        try {
            // make sure trip exists
            if (exists(mapper.getById(id))) {
                // delete the trip in the DB by passing the trip object from the resource to the mapper
                int result = mapper.deleteById(id);
                // set APIResponse body, status, and message based on result of action
                if (result > 0) {
                    response.setStatus(HttpStatus.OK);
                    response.setMessage("Successfully deleted Trip Id " + id);
                } else {
                    response.setStatus(HttpStatus.BAD_REQUEST);
                    response.setMessage("Failed to delete Trip Id " + id);
                }
            } else {
                response.setStatus(HttpStatus.BAD_REQUEST);
                response.setMessage("Trip does not exist");
            }
        } catch (Exception deleteError) {
            // set APIResponse status and message
            response.setStatus(HttpStatus.BAD_REQUEST);
            response.setMessage("Unable to process request: "+ deleteError.getMessage());
        }
        // return APIResponse object to resource
        return response;
    }

    // Validate
    public boolean exists(Trip trip) {
        try {
            // returns true if the id or email returns a trip
            return (mapper.getById(trip.getId()) != null);
        }catch (Exception readError){
            return false;
        }
    }

}
