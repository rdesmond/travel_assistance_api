package com.mappers;

import com.models.DBTestModel;
import org.apache.ibatis.annotations.*;

import java.util.ArrayList;

/** Example mapper for sql queries, maps query response to model
 *
 * To use this:
 *  - copy to your mapper class
 *  - ctrl-f "DBTestModel", select all occurrences, type your Class name
 *  - ctrl-f "model", select all occurrences, type your model name
 *  - edit SQL queries to match database table
 *  - test in Postman after all classes are finished
 *
 *  Created by tdavis on 5/8/17.
 * Updated by Cass on 5/11/17 to utilize APIResponse Object
 */

@Mapper
public interface DBTestMapper {

    //define query
    String GET_ALL = "select * from model";
    String GET_BY_ID = "select * from model where id = #{id}";
    String DELETE_BY_ID = "delete from model where id = #{id}";
    String UPDATE_BY_ID = "update model set " +
            "first_name = #{first_name}, " +
            "last_name = #{last_name} " +
            "where id = #{id}";
    String ADD_NEW = "insert into model " +
            "(first_name, last_name)" +
            "values (#{first_name}, #{last_name})";

    //define method of query, used in service logic, maps response to model
    //Create
    @Insert(ADD_NEW)
    @Options(useGeneratedKeys = true)
    void addNew(DBTestModel model);

    //Read
    @Select(GET_ALL)
    ArrayList<DBTestModel> getAll();

    @Select(GET_BY_ID)
    DBTestModel getById(int id);

    //Update
    @Update(UPDATE_BY_ID)
    int updateById(DBTestModel model);

    //Delete
    @Delete(DELETE_BY_ID)
    int deleteById(int id);
}
