package com.resources.users;

import com.apis.APIResponse;
import com.models.internal.User;
import com.services.users.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
        return service.addNew(user);
    }

    //Read
    @RequestMapping("/")
    public APIResponse getAll(){
        return service.getAll();
    }
    @RequestMapping("/{id}")
    public APIResponse getById(@PathVariable(value="id")int id) {
        return service.getById(id);
    }

    //Update
    @RequestMapping(method = RequestMethod.PATCH, value = "/")
    public APIResponse updateById(@RequestBody User user) {
        return service.updateById(user);
    }

    //Delete
    @RequestMapping(path="/", method= RequestMethod.DELETE)
    public APIResponse deleteById(@RequestParam(value="id")int id){
        return service.deleteById(id);
    }
}
