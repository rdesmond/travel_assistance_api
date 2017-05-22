package com.mappers;

import com.models.internal.Trip;
import org.apache.ibatis.annotations.*;
import java.util.ArrayList;

/**
 * Executes SQL queries for Trip
 * @author cass
 */

@Mapper
public interface TripMapper {

    //SQL queries
    String GET_ALL = "select * from trips";
    String GET_BY_ID = "select * from trips where id = #{id}";
    String DELETE_BY_ID = "delete from trips where id = #{id}";
    String UPDATE_BY_ID = "update trips set " +
            "user_id = #{user_id}, " +
            "start_date = #{start_date}, " +
            "end_date = #{end_date}, " +
            "num_travellers = #{num_travellers}, " +
            "where id = #{id}";
    String ADD_NEW = "insert into trips " +
            "(user_id, start_date, end_date, num_travellers)" +
            "values (#{user_id}, #{start_date}, #{end_date}, #{num_travellers})";
    String GET_BY_USER_ID = "select * from trips where user_id = #{user_id}";

    //Create
    @Insert(ADD_NEW)
    @Options(useGeneratedKeys = true)
    void addNew(Trip trip);

    //Read
    @Select(GET_ALL)
    ArrayList<Trip> getAll();

    @Select(GET_BY_ID)
    Trip getById(int id);

    @Select(GET_BY_USER_ID)
    ArrayList<Trip> getByUserId(int user_id);

    //Update
    @Update(UPDATE_BY_ID)
    int updateById(Trip trip);

    //Delete
    @Delete(DELETE_BY_ID)
    int deleteById(int id);
}
