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
    String GET_BY_ID_ONLY = "select * from trips where id = #{id}";
    String GET_BY_ID_AND_USER = "select * from trips where user_id = #{user_id} AND id = #{id}";
    String DELETE_BY_ID = "delete from trips where id = #{id}";
    String UPDATE_BY_ID = "update trips set " +
            "user_id = #{user_id}, " +
            "start_date = #{start_date}, " +
            "end_date = #{end_date}, " +
            "num_travellers = #{num_travellers}, " +
            "budget = #{budget}, " +
            "value = #{value}, " +
            "beach = #{beach}, " +
            "culture = #{culture}, " +
            "food = #{food}, " +
            "luxury = #{luxury}, " +
            "mountain = #{mountain}, " +
            "tropical = #{tropical}, " +
            "desert = #{desert}, " +
            "adventure = #{adventure}, " +
            "romance = #{romance}, " +
            "relaxation = #{relaxation}, " +
            "nature = #{nature}, " +
            "sports = #{sports} " +
            "where id = #{id} ";
    String ADD_NEW = "insert into trips " +
            "(user_id, start_date, end_date, num_travellers, budget, value, beach, culture, food, luxury, mountain, "+
            "tropical, desert, adventure, romance, relaxation, nature, sports)" +
            "values (#{user_id}, #{start_date}, #{end_date}, #{num_travellers}, #{budget}, #{value}, #{beach}, " +
            "#{culture}, #{food}, #{luxury}, #{mountain}, #{tropical}, #{desert}, #{adventure}, #{romance}," +
                    "#{relaxation}, #{nature}, #{sports})";
    String GET_BY_USER_ID = "select * from trips where user_id = #{user_id}";

    //Create
    @Insert(ADD_NEW)
    @Options(useGeneratedKeys = true)
    void addNew(Trip trip);

    //Read
    @Select(GET_ALL)
    ArrayList<Trip> getAll();

    @Select(GET_BY_ID_ONLY)
    Trip getByIdOnly(int id);

    @Select(GET_BY_ID_AND_USER)
    Trip getById(@Param("user_id")int user_id, @Param("id")int id);

    @Select(GET_BY_USER_ID)
    ArrayList<Trip> getByUserId(int user_id);

    //Update
    @Update(UPDATE_BY_ID)
    int updateById(Trip trip);

    //Delete
    @Delete(DELETE_BY_ID)
    int deleteById(int id);
}
