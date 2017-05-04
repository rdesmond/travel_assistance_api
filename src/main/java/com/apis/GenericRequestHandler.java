package com.apis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 *Generic class to call 3rd party APIs, based off this sample:
 * https://github.com/mouryar/spring-boot-generic-rest-client-sample
 * @author cass
 */
public class GenericRequestHandler<T, V>{

    @Autowired
    RestTemplate restTemplate;

    public V callAPI(ThirdPartyRequest thirdPartyRequest, T data, Class<V> genericClass){
        HttpHeaders headers = new HttpHeaders();

        HttpEntity<T> entity = new HttpEntity<T>(data, headers);
        ResponseEntity<V> response = restTemplate.exchange(thirdPartyRequest.getUrl(), thirdPartyRequest.getRequestType(),
                entity, genericClass);
        return response.getBody();
    }

    /**
     * These are examples of how to use the generic request handler.
     * I can use these for testing once I have an API and POJOs, then use this format for all other 3rd party calls.
     */
    public void exampleGet() {
        new GenericRequestHandler<String, String>()
                .callAPI(
                        new ThirdPartyRequest("http://exampleWebsite", HttpMethod.GET),
                        "", String.class);
    }
    public void examplePost(){
        new GenericRequestHandler<String, String>()
                .callAPI(
                        new ThirdPartyRequest("http://exampleWebsite", HttpMethod.POST),
                        "Data", String.class);
    }
}





