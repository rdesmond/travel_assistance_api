package com.services.hotels;

import com.apis.GenericRequestHandler;
import com.apis.ThirdPartyRequest;
import com.models.allmyles.hotels.search.SearchRequest;
import com.models.allmyles.hotels.search.SearchResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;

/**
 * Created by yovaliceroman on 5/18/17.
 */

@Service
public class HotelSearchService {

    @Autowired
    private GenericRequestHandler handler;

    public SearchResponse searchHotels(SearchRequest search){

        HttpHeaders headers = new HttpHeaders();
        headers.add("X-Auth-Token", "af327616-9978");
        headers.add("Content-Type", "application/json");
        headers.add("Cookie", "Cookie123");
        ThirdPartyRequest request = new ThirdPartyRequest(
                "https://dev.allmyles.com/v2.0/hotels", HttpMethod.POST);
        return (SearchResponse) handler.callAPI(request, search, SearchResponse.class, headers);
    }
}
