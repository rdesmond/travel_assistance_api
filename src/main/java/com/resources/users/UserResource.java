package com.resources.users;

import com.apis.APIResponse;
import com.models.User;
import com.services.users.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;

/**
 * Maps the URI to a method that calls the UserService methods and returns a Response object with a status code, message,
 * and requested data
 * @author cass
 */

@RestController
@RequestMapping ("/users")
public class UserResource {

    @Autowired
    private UserService service;

    //Create
    @RequestMapping(method = RequestMethod.POST, value = "/")
    public APIResponse addNew(@RequestBody User user) {
        User newUser = service.addNew(user);
        return new APIResponse(HttpStatus.OK, newUser);
    }

    //Read
    @RequestMapping("/")
    public APIResponse getAll(){
        ArrayList<User> users = service.getAll();
        if (users.size() == 0) {
            return new APIResponse(HttpStatus.NO_CONTENT);
        } else {
            return new APIResponse(HttpStatus.OK, users);
        }
    }
    @RequestMapping("/{id}")
    public APIResponse getById(@PathVariable(value="id")int id) {
        User user = service.getById(id);
        return new APIResponse(HttpStatus.OK, user);
    }

    //Update
    @RequestMapping(method = RequestMethod.PATCH, value = "/")
    public APIResponse updateById(@RequestBody User user) {
        User newUser = service.updateById(user);
        return new APIResponse(HttpStatus.OK, newUser);
    }

    //Delete
    @RequestMapping(path="/", method= RequestMethod.DELETE)
    public APIResponse deleteById(@RequestParam(value="id")int id){
        String message = service.deleteById(id);
        return new APIResponse(HttpStatus.OK, message);
    }
}
