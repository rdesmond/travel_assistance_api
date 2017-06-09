package com.mappers;

import com.models.internal.Destination;
import org.apache.ibatis.annotations.*;
import java.util.ArrayList;

/**
 * @author cass
 */
@Mapper
public interface DestinationMapper {

    //SQL queries
    String GET_ALL  = "select * from destinations";
    String GET_BY_ID = "select * from destinations where id = #{id}";
    String GET_BY_SUB_REGION = "SELECT * FROM destinations WHERE sub_region = #{sub_region}";
    String GET_BY_TAG = "SELECT * FROM destinations WHERE #{tag} = 1";
    String GET_BY_COUNTRY = "SELECT * FROM destinations WHERE country = #{country}";
    String GET_IATA = "SELECT iata_code FROM airports where name = #{destination}";

    //Read
    @Select(GET_ALL)
    ArrayList<Destination> getAll();

    @Select(GET_BY_ID)
    Destination getById(int id);

    @Select(GET_BY_SUB_REGION)
    ArrayList<Destination> getBySubRegion(String sub_region);

    @Select(GET_BY_TAG)
    ArrayList<Destination> getByTag(String tag);

    @Select(GET_BY_COUNTRY)
    ArrayList<Destination> getByCountry(String country);

    @Select(GET_IATA)
    String[] getIATA(String destination);

}
