package com.mappers;

import com.models.internal.User;
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
            "last_name = #{last_name}, " +
            "email_address = #{email_address}, " +
            "address = #{address}, " +
            "phone_number = #{phone_number} " +
            "where id = #{id}";
    String ADD_NEW = "insert into users " +
            "(first_name, last_name, email_address, address, phone_number)" +
            "values (#{first_name}, #{last_name}, #{email_address}, #{address}, #{phone_number})";
    String GET_BY_EMAIL = "select * from users where email_address = #{email_address}";

    //Create
    @Insert(ADD_NEW)
    @Options(useGeneratedKeys = true)
    void addNew(User user);

    //Read
    @Select(GET_ALL)
    ArrayList<User> getAll();

    @Select(GET_BY_ID)
    User getById(int id);

    @Select(GET_BY_EMAIL)
    User getByEmail(String email_address);

    //Update
    @Update(UPDATE_BY_ID)
    int updateById(User user);

    //Delete
    @Delete(DELETE_BY_ID)
    int deleteById(int id);
}
