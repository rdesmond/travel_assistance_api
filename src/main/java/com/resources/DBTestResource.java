package com.resources;

import com.apis.APIResponse;
import com.models.DBTestModel;
import com.models.DBTestResponse;
import com.services.DBTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

/** Example http-request end-points, returns APIResponse with HttpStatus and requested object or message
 *
 * To use this:
 *  - copy to your service class
 *  - ctrl-f "DBTestModel", select all occurrences, type your Class name
 *  - ctrl-f "model", select all occurrences, type your model name
 *  - test in Postman after all classes are finished
 *
 * Created by tdavis on 5/8/17.
 * Updated by Cass on 5/11/17 to utilize APIResponse Object
 */

@RestController
@RequestMapping("/dbtest")
public class DBTestResource {

    //managed bean for Spring Dependency Injection
    @Autowired
    private DBTestService service;

    //define your endpoint responses
    //Create
    @RequestMapping(method = RequestMethod.POST, value = "/")
    public APIResponse addNew(@RequestBody DBTestModel model) {
        DBTestModel newDBTestModel = service.addNew(model);
        return new APIResponse(newDBTestModel, HttpStatus.OK);
    }

    //Read
    @RequestMapping("/")
    public APIResponse getAll(){
        ArrayList<DBTestModel> models = service.getAll();
        if (models.size() == 0) {
            return new APIResponse(HttpStatus.NO_CONTENT);
        } else {
            return new APIResponse(models, HttpStatus.OK);
        }
    }
    @RequestMapping("/{id}")
    public APIResponse getById(@PathVariable(value="id")int id) {
        DBTestModel model = service.getById(id);
        return new APIResponse(model, HttpStatus.OK);
    }

    //Update
    @RequestMapping(method = RequestMethod.PATCH, value = "/")
    public APIResponse updateById(@RequestBody DBTestModel model) {
        DBTestModel newDBTestModel = service.updateById(model);
        return new APIResponse(newDBTestModel, HttpStatus.OK);
    }

    //Delete
    @RequestMapping(path="/", method= RequestMethod.DELETE)
    public APIResponse deleteById(@RequestParam(value="id")int id){
        String message = service.deleteById(id);
        return new APIResponse(HttpStatus.OK, message);
    }
}
