package com.mappers;

import com.models.DBTestModel;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.ArrayList;

/**
 * Created by tdavis on 5/8/17.
 */
/*
* example mapper for sql queries, maps query response to model
*/
@Mapper
public interface DBTestMapper {

    //define query
    String GET_ALL_USERS = "select * from users";

    //define method of query, used in service logic, maps response to model
    @Select(GET_ALL_USERS)
    ArrayList<DBTestModel> getAllUsers();
}
