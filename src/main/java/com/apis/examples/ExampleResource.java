package com.apis.examples;

import com.apis.APIResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *  * This is an example of how to use the GenericRequestHandler, ThirdPartyRequest, and APIResponse to call an API and
 * return the response as an object.
 *
 * Since the Service class handles all of the logic, this just needs to take in the request and pass it to the service
 * @author cass
 */
@RestController
public class ExampleResource {

    @Autowired
    private ExampleService service;

    @RequestMapping("/object")
    public APIResponse objectGet(){
        return service.getAll();
    }

    @RequestMapping(method = RequestMethod.POST, value = "/object")
    public APIResponse objectPost(@RequestBody Object body) {
        return service.addNew(body);
    }
}
