package com.resources;

import com.apis.APIResponse;
import com.models.internal.Trip;
import com.services.TripService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/** Maps the URI to a method that calls the TripService methods and returns a Response object with a status code,
 * message, and requested data
 * @author cass
 */
@RestController
@RequestMapping("/trips")
public class TripResource {
    @Autowired
    private TripService service;

    //Create
    @RequestMapping(method = RequestMethod.POST, value = "/")
    public APIResponse addNew(@RequestBody Trip trip) {
        return service.addNew(trip);
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
    @RequestMapping("/{user_id}")
    public APIResponse getByUserId(@PathVariable(value="user_id")int user_id){
        return service.getByUserId(user_id);
    }

    //Update
    @RequestMapping(method = RequestMethod.PATCH, value = "/")
    public APIResponse updateById(@RequestBody Trip trip) {
        return service.updateById(trip);
    }

    //Delete
    @RequestMapping(path="/", method= RequestMethod.DELETE)
    public APIResponse deleteById(@RequestParam(value="id")int id){
        return service.deleteById(id);
    }

}
