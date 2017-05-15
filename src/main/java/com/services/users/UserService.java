package com.services.users;

import com.apis.APIResponse;
import com.mappers.UserMapper;
import com.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import java.util.ArrayList;

/**
 * Receives the User or UserId from the resource, passes to the mapper, and returns an APIResponse.
 * Each method will check if the user exists and respond accordingly and handle any exceptions.
 *
 * @author cass
 */
@Service
public class UserService {

    @Autowired
    private UserMapper mapper;
    @Autowired
    private APIResponse response;

    // Create
    public APIResponse addNew(User user){
        try{
            //test is user exists
            if (exists(user)){
                response.setStatus(HttpStatus.OK);
                response.setMessage("User already exists");
            }else {
                // create the user in the DB by passing the user object from the resource to the mapper
                mapper.addNew(user);
                // set APIResponse body, status, and message
                response.setBody(mapper.getById(user.getId()));
                response.setStatus(HttpStatus.CREATED);
                response.setMessage("Successfully created UserId: " + user.getId());
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
            ArrayList<User> users = mapper.getAll();
            if (users.size() == 0) {
                response.setStatus(HttpStatus.NO_CONTENT);
                response.setMessage("No users found");
            } else {
                response.setBody(users);
                response.setStatus(HttpStatus.OK);
            }
        }catch (Exception readError) {
            response.setStatus(HttpStatus.BAD_REQUEST);
            response.setMessage("Unable to process request: "+ readError.getMessage());
        }
        return response;
    }
    public APIResponse getById(int id){
        try {
            // make sure user exists
            if (exists(mapper.getById(id))) {
                response.setBody(mapper.getById(id));
                response.setStatus(HttpStatus.OK);
            }else {
                response.setStatus(HttpStatus.OK);
                response.setMessage("User does not exist");
            }
        }catch (Exception readError) {
            response.setStatus(HttpStatus.BAD_REQUEST);
            response.setMessage("Unable to process request: "+ readError.getMessage());
        }
        return response;
    }

   // Update
   public APIResponse updateById(User user){
       try{
           // update the user in the DB by passing the user object from the resource to the mapper
           int id = mapper.updateById(user);
           // set APIResponse body, status, and message
           response.setBody(mapper.getById(id));
           response.setStatus(HttpStatus.OK);
           response.setMessage("Successfully updated UserId: "+ user.getId());
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
           // make sure user exists
           if (exists(mapper.getById(id))) {
               // delete the user in the DB by passing the user object from the resource to the mapper
               int result = mapper.deleteById(id);
               // set APIResponse body, status, and message based on result of action
               if (result > 0) {
                   response.setStatus(HttpStatus.OK);
                   response.setMessage("Successfully deleted User Id " + id);
               } else {
                   response.setStatus(HttpStatus.OK);
                   response.setMessage("Failed to delete User Id " + id);
               }
           } else {
               response.setStatus(HttpStatus.OK);
               response.setMessage("User does not exist");
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
    boolean exists(User user) {
        try {
            return (mapper.getById(user.getId()) != null | mapper.getByEmail(user.getEmail_address()) != null);
        }catch (Exception readError){
            return false;
        }
    }
}
