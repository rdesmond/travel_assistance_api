package com.resources.flights;

import com.apis.GenericRequestHandler;
import com.apis.ThirdPartyRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


//POST /flights

@RestController
public class SearchResource {

    @Autowired
    private GenericRequestHandler handler;

    @RequestMapping(method = RequestMethod.POST, value = "/flights")
    public Object searchFlights(){
        HttpHeaders headers = new HttpHeaders();

        headers.add("Content-type", "application/json");
        headers.add("Cookie", "cookie from customer computer");
        headers.add("X-Auth-Token", "af327616-9978");

        ThirdPartyRequest searchFlights = new ThirdPartyRequest(
                "https://dev.allmyles.com/v2.0/flights?key=af327616-9978", HttpMethod.POST);

        return handler.callAPI(searchFlights,"Body of the request", String.class, headers);
    }
}