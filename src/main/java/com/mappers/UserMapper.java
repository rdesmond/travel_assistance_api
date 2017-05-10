package com.mappers;

import com.models.User;
import org.apache.ibatis.annotations.*;

import java.util.ArrayList;

/**
 * Executes SQL queries for User
 * @author cass
 */
@Mapper
public interface UserMapper {

    //SQL queries
    String GET_ALL = "select * from users";
    String GET_BY_ID = "select * from users where id = #{id}";
    String DELETE_BY_ID = "delete from users where id = #{id}";
    String UPDATE_BY_ID = "update users set " +
            "first_name = #{first_name}, " +
            "last_name = #{last_name} " +
            "email = #{email} " +
            "address = #{address} " +
            "phone_number = #{phone_number} " +
            "where id = #{id}";
    String ADD_NEW = "insert into users " +
            "(first_name, last_name, email_address, address, phone_number)" +
            "values (#{first_name}, #{last_name}, #{email_address}, #{address}, #{phone_number})";

    //Create
    @Insert(ADD_NEW)
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int addNew(Object user);

    //Read
    @Select(GET_ALL)
    ArrayList<User> getAll();

    @Select(GET_BY_ID)
    User getById(int id);

    //Update
    @Update(UPDATE_BY_ID)
    int updateById(Object user);

    //Delete
    @Delete(DELETE_BY_ID)
    int deleteById(int id);
}
