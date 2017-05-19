package com.services.hotels;

import com.apis.GenericRequestHandler;
import com.apis.ThirdPartyRequest;
import com.models.allmyles.hotels.details.DetailsRequest;
import com.models.allmyles.hotels.details.DetailsResponse;
import com.models.allmyles.hotels.search.Hotel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;

/**
 * Created by yovaliceroman on 5/19/17.
 */

@Service
public class HotelDetailsService {

    @Autowired
    private GenericRequestHandler handler;

    public DetailsResponse getHotels(DetailsRequest detailsRequest){
        HttpHeaders headers = new HttpHeaders();
        headers.add("X-Auth-Token", "af327616-9978");
        headers.add("Content-Type", "application/json");
        headers.add("Cookie", "Cookie");
        ThirdPartyRequest request = new ThirdPartyRequest(
                "https://dev.allmyles.com/v2.0/hotels/" + detailsRequest.getHotel_id(), HttpMethod.GET);
        return (DetailsResponse) handler.callAPI(request, detailsRequest , DetailsResponse.class, headers);

    }
}
