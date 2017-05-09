package com.apis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * Generic class to call 3rd party APIs, based off this sample:
 * https://github.com/mouryar/spring-boot-generic-rest-client-sample
 * @author cass
 */
public class GenericRequestHandler<T, V>{

    //This auto-creates an instance of RestTemplate which is Spring's central class for client-side HTTP access
    @Autowired
    RestTemplate restTemplate;


    /**
     * The callAPI method is used to make client-side API calls that return a response. It takes the API info provided
     * in a ThirdPartyRequest object and uses an instance of HttpEntity and ResponseEntity to return an object
     * of the specific type(V)
     *
     * @param thirdPartyRequest - you'll need to create an instance of this class that contains the specific API details
     * @param genericClass - the class you want the response returned to, which is passed to the restTemplate.exchange
     *                     method
     * @return - the body of the responseEntity - this is a object of the genericClass specified above
     */
    public V callAPI(ThirdPartyRequest thirdPartyRequest, Class<V> genericClass){

        HttpEntity<T> entity = new HttpEntity<T>(null,null);
        ResponseEntity<V> response = restTemplate.exchange(thirdPartyRequest.getUrl(), thirdPartyRequest.getRequestType(),
                entity, genericClass);
        return response.getBody();
    }
    /**
     * Overloaded callAPI method that is the same as above, but adds a requestBody parameter
     *
     * @param thirdPartyRequest - you'll need to create an instance of this class that contains the specific API details
     * @param requestBody - body of the request that gets passed to the HttpEntity constructor
     * @param genericClass - the class you want the response returned to, which is passed to the restTemplate.exchange
     *                     method
     * @return - the body of the responseEntity - this is a object of the genericClass specified above
     */
    public V callAPI(ThirdPartyRequest thirdPartyRequest, T requestBody, Class<V> genericClass){

        HttpEntity<T> entity = new HttpEntity<T>(requestBody);
        ResponseEntity<V> response = restTemplate.exchange(thirdPartyRequest.getUrl(), thirdPartyRequest.getRequestType(),
                entity, genericClass);
        return response.getBody();
        }

    /**
     * Overloaded callAPI method that is the same as above, but allows headers parameter
     *
     * @param thirdPartyRequest - you'll need to create an instance of this class that contains the specific API details
     * @param requestBody - body of the request that gets passed to the HttpEntity constructor
     * @param genericClass - the class you want the response returned to, which is passed to the restTemplate.exchange
     *                     method
     * @param headers - an instance of HttpHeaders that consists of a name and value
     * @return the body of the responseEntity - this is a object of the genericClass specified above
     */
    public V callAPI(ThirdPartyRequest thirdPartyRequest, T requestBody, Class<V> genericClass, HttpHeaders headers){

        HttpEntity<T> entity = new HttpEntity<T>(requestBody, headers);
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
                        new ThirdPartyRequest("http://exampleWebsite", HttpMethod.GET), String.class);
    }
    public void examplePost(){
        HttpHeaders headers = new HttpHeaders();
        headers.add("Basic-Auth", "examplekey");
        new GenericRequestHandler<String, String>()
                .callAPI(
                        new ThirdPartyRequest("http://exampleWebsite", HttpMethod.POST),
                        "Body of the request", String.class, headers);
    }
}





