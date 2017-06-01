package com.services;

import com.apis.APIResponse;
import com.mappers.DestinationMapper;
import com.models.internal.Destination;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

/**
 * @author cass
 */
@Service
public class DestinationService {


    @Autowired
    private DestinationMapper mapper;

    // Read
    public ArrayList<Destination> getAll(){
            return mapper.getAll();
    }

    public ArrayList<Destination> getBySubRegion(String sub_region){
        return mapper.getBySubRegion(sub_region);
    }

    public ArrayList<Destination> getByTag(String tag){
        return mapper.getByTag(tag);
    }

    public ArrayList<Destination> getByCountry(String country) {
        return mapper.getByCountry(country);
    }
}
