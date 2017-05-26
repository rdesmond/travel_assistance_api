package com.services;

import com.apis.APIResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

/**
 * @author cass
 */
@Service
public class DestinationService {

    @Autowired
    private APIResponse response;

    // Read
    public APIResponse getAll(){
//        try {
//            // make sure there are trips
//            ArrayList<Trip> trips = mapper.getAll();
//            // set APIResponse body, status, and message
//            if (trips.size() == 0) {
//                response.setStatus(HttpStatus.NO_CONTENT);
//                response.setMessage("No trips found");
//            } else {
//                response.setBody(trips);
//                response.setStatus(HttpStatus.OK);
//            }
//        }catch (Exception readError) {
//            // set APIResponse status and message
//            response.setStatus(HttpStatus.BAD_REQUEST);
//            response.setMessage("Unable to process request: "+ readError.getMessage());
//        }
//        // return APIResponse object to resource
        return response;
    }
}
