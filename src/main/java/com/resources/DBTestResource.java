package com.resources;

import com.models.DBTestModel;
import com.models.DBTestResponse;
import com.services.DBTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

/**
 * Created by tdavis on 5/8/17.
 */
/*
* example http-request end-point, returns response with object (users) and status (status code)
*/
@RestController
@RequestMapping("/dbtest")
public class DBTestResource {

    //managed bean for Spring DI
    @Autowired
    DBTestService dbTestService;

    //define your endpoint response
    @RequestMapping(method = RequestMethod.GET, value = "/")
    public DBTestResponse getAllUsers() {
        ArrayList<DBTestModel> users = new ArrayList();
        users = dbTestService.getAllUsers();
        return new DBTestResponse(users, "200");
    }
}
