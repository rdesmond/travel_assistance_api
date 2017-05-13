package com.services.flights;

import com.apis.GenericRequestHandler;
import com.apis.ThirdPartyRequest;
import com.models.allmyles.flights.search.request.SearchFlights;
import com.models.allmyles.flights.search.response.SearchResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;

@Service
public class SearchService {

    @Autowired
    private GenericRequestHandler handler;

    public SearchResult searchFlights(SearchFlights searchFlights){
        HttpHeaders headers = new HttpHeaders();

        headers.add("Content-type", "application/json");
        headers.add("Cookie", "Cookie");
        headers.add("X-Auth-Token", "af327616-9978");

        ThirdPartyRequest request = new ThirdPartyRequest(
                "https://dev.allmyles.com/v2.0/flights", HttpMethod.POST);

        return (SearchResult) handler.callAPI(request,searchFlights, SearchResult.class, headers);
    }
}