package com.services;

import com.mappers.DBTestMapper;
import com.models.DBTestModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

/**
 * Created by tdavis on 5/8/17.
 */
/*
* example service, model meets method
*/
@Service
public class DBTestService {

    @Autowired
    DBTestMapper dbTestMapper;

    public ArrayList<DBTestModel> getAllUsers() {
        return dbTestMapper.getAllUsers();
    }
}