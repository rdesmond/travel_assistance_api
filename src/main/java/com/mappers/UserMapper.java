package com.mappers;

import com.models.User;
import java.util.ArrayList;

/**
 * This needs MyBatis before it'll work. I also need to update the sql queries once the user fields are defined in the
 * database
 * @author cass
 */
//@Mapper
public interface UserMapper {

    //SQL queries
    String GET_ALL = "select * from users";
    String GET_BY_ID = "select * from users where userId = #{id}";
    String DELETE_BY_ID = "delete from users where userId = #{id}";
    String UPDATE_BY_ID = "update users set " +
            "firstName = #{firstName}, " +
            "lastName = #{lastName} " +
            "where id = #{id}";
    String ADD_NEW = "insert into users " +
            "(firstName, lastName)" +
            "values (#{firstName}, #{lastName})";

    //Create
//    @Insert(ADD_NEW)
//    @Options(useGeneratedKeys = true, keyProperty = "id")
    int addNew(Object user);

    //Read
//    @Select(GET_ALL)
    ArrayList<User> getAll();

//    @Select(GET_BY_ID)
    User getById(int id);

    //Update
//    @Update(UPDATE_BY_ID)
    int updateById(Object user);

    //Delete
//    @Delete(DELETE_BY_ID)
    int deleteById(int id);
}
