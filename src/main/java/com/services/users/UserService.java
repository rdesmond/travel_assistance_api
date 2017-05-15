package com.services.users;

import com.apis.APIResponse;
import com.mappers.UserMapper;
import com.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import java.util.ArrayList;

/**
 * Contains any business logic and calls the mapper methods for User
 * @author cass
 */
@Service
public class UserService {

    @Autowired
    private UserMapper mapper;
    @Autowired
    private APIResponse response;

    //need to add in exception handling
    //what to do if user already exists/doesn't exist - require unique identifier?

    //Create
    public APIResponse addNew(User user){
        try{
        // create the user in the DB by passing the user object from the resource to the mapper
        mapper.addNew(user);
        // set APIResponse body, status, and message
        response.setBody(mapper.getById(user.getId()));
        response.setStatus(HttpStatus.CREATED);
        response.setMessage("Successfully created UserId: "+ user.getId());
        } catch (Exception mappingError) {
        // set APIResponse status and message
        response.setStatus(HttpStatus.CONFLICT);
        response.setMessage("Unable to process request: "+ mappingError.getMessage());
        }
        // return APIResponse object to resource
        return response;
    }

    //Read
    public ArrayList<User> getAll(){
        return mapper.getAll();
    }
    public User getById(int id){
        return mapper.getById(id);
    }

   //Update
   public User updateById(User user){
       int id = mapper.updateById(user);
       return mapper.getById(id);
   }

   //Delete
    public String deleteById(int id){
        int result = mapper.deleteById(id);
        if (result > 0)
            return "successfully deleted User Id " + id;
        else
            return "failed to delete User Id " + id;
    }
    public boolean exists(User user) {
        return getById(user.getId()) != null;
    }
}
