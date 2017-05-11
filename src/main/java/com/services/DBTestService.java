package com.services;

import com.mappers.DBTestMapper;
import com.models.DBTestModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

/** Example service - gets object/message from mapper and returns to resource. Any business logic should go here.
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
/*
* example service, model meets method
*/
@Service
public class DBTestService {

    @Autowired
    private DBTestMapper mapper;

    //Create
    public DBTestModel addNew(DBTestModel model){
        mapper.addNew(model);
        return mapper.getById(model.getId());
    }

    //Read
    public ArrayList<DBTestModel> getAll(){
        return mapper.getAll();
    }
    public DBTestModel getById(int id){
        return mapper.getById(id);
    }

    //Update
    public DBTestModel updateById(DBTestModel model){
        int id = mapper.updateById(model);
        return mapper.getById(id);
    }

    //Delete
    public String deleteById(int id){
        int result = mapper.deleteById(id);
        if (result > 0)
            return "successfully deleted Model Id " + id;
        else
            return "failed to delete Model Id " + id;
    }
}