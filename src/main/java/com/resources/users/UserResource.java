package com.resources.users;

import com.models.User;
import com.services.users.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;

/**
 * This needs the response object and MyBatis before it'll work
 *
 * @author cass
 */

@RestController
@RequestMapping ("/users")
public class UserResource {

    @Autowired
    private UserService service;

//    //Create
//    @RequestMapping(method = RequestMethod.POST, value = "/")
//    public Response addNew(@RequestBody Object user) {
//        User newUser = service.addNew(user);
//        return new Response(HTTPStatusCode.OK, newUser);
//    }
//
//    //Read
//    @RequestMapping("/")
//    public Response getAll(){
//        ArrayList<User> users = service.getAll();
//        if (users.size() == 0) {
//            return new Response(HTTPStatusCode.NO_CONTENT);
//        } else {
//            return new Response(HTTPStatusCode.OK, users);
//        }
//    }
//    @RequestMapping("/{id}")
//    public Response getById(@RequestParam(value="id")int id) {
//        User user = service.getById(id);
//        return new Response(HTTPStatusCode.OK, user);
//    }
//
//    //Update
//    @RequestMapping(method = RequestMethod.PATCH, value = "/")
//    public Response updateById(@RequestBody Object user) {
//        User newUser = service.updateById(user);
//        return new Response(newUser);
//    }
//
//    //Delete
//    @RequestMapping(path="/", method= RequestMethod.DELETE)
//    public Response deleteById(@RequestParam(value="userId")int id){
//        String message = service.deleteById(id);
//        return new Response(HTTPStatusCode.OK, message);
//    }
}
