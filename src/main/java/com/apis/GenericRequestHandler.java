package com.apis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.HttpServerErrorException;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

/**
 * Generic class to call 3rd party APIs, based off this sample:
 * https://github.com/mouryar/spring-boot-generic-rest-client-sample
 * @author cass
 */
@Service
public class GenericRequestHandler<T, V>{

    //This auto-creates an instance of RestTemplate which is Spring's central class for client-side HTTP access
    @Autowired
    private RestTemplate restTemplate;

    /**
     * The callAPI method is used to make client-side API calls that return a response. It takes the API info provided
     * in a ThirdPartyRequest object and uses an instance of HttpEntity and ResponseEntity to return an object
     * of the specific type(V).
     * It is overloaded several times for use with or without headers and body.
     *
     * @param thirdPartyRequest - you'll need to create an instance of this class that contains the specific API details
     * @param genericClass - the class you want the response returned to, which is passed to the restTemplate.exchange
     *                     method
     * @return - the body of the responseEntity - this is a object of the genericClass specified above
     */
    //no headers or body
    public V callAPI(ThirdPartyRequest thirdPartyRequest, Class<V> genericClass)
    throws RestClientException{

        HttpEntity<T> entity = new HttpEntity<T>(null,null);
        ResponseEntity<V> response = restTemplate.exchange(thirdPartyRequest.getUrl(), thirdPartyRequest.getRequestType(),
                entity, genericClass);
        try {
            if (isSuccessful(response.getStatusCode()))
                return response.getBody();
            else throw new RestClientException(response.getStatusCode().getReasonPhrase());
        }
             catch (RestClientException e) {
                throw e;
        }
    }
    /** @param requestBody - body of the request that gets passed to the HttpEntity constructor
     */
    // body, no headers
    public V callAPI(ThirdPartyRequest thirdPartyRequest, T requestBody, Class<V> genericClass){

        HttpEntity<T> entity = new HttpEntity<T>(requestBody);
        ResponseEntity<V> response = restTemplate.exchange(thirdPartyRequest.getUrl(), thirdPartyRequest.getRequestType(),
                entity, genericClass);
        return response.getBody();
        }

    /** @param headers - an instance of HttpHeaders that consists of a name and value
     */
    // headers, no body
    public V callAPI(ThirdPartyRequest thirdPartyRequest, Class<V> genericClass, HttpHeaders headers){

        HttpEntity<T> entity = new HttpEntity<T>(headers);
        ResponseEntity<V> response = restTemplate.exchange(thirdPartyRequest.getUrl(), thirdPartyRequest.getRequestType(),
                entity, genericClass);
        return response.getBody();
    }
    // body and headers
    public V callAPI(ThirdPartyRequest thirdPartyRequest, T requestBody, Class<V> genericClass, HttpHeaders headers){

        HttpEntity<T> entity = new HttpEntity<T>(requestBody, headers);
        ResponseEntity<V> response = restTemplate.exchange(thirdPartyRequest.getUrl(), thirdPartyRequest.getRequestType(),
                entity, genericClass);
        return response.getBody();
    }

    /**
     * used to set the value of successfulRequest
     * @param status HttpStatus enum passed from the ResponseEntity object
     * @return true if status is 2xx, else false
     * @throws RestClientException - client or server specific exception thrown based on status code
     */
    public boolean isSuccessful(HttpStatus status)
            throws RestClientException {
        if (status.is2xxSuccessful())
            return true;
        else if (status.is4xxClientError())
            throw new HttpClientErrorException(status);
        else if (status.is5xxServerError())
            throw new HttpServerErrorException(status);
        else throw new RestClientException(status.getReasonPhrase());
    }

}

    /**
     * Functional example resource class using the generic request handler. This could also be used outside of a
     * resource class by just calling the methods, beerGet and beerPost. Note the @RestController annotation on the
     * class and the @Autowired injection of the GenericRequestHandler.
     */
//    @RestController
//    class BeerResource {
//
//        @Autowired
//        private GenericRequestHandler handler;
//
//        @RequestMapping("/beer")
//        public Object beerGet() {
//            ThirdPartyRequest callBeer = new ThirdPartyRequest(
//                    "http://api.brewerydb.com/v2/beer/random?key=47dd1ef7d420f2f8b23998fabfbc336e", HttpMethod.GET);
//            return handler.callAPI(callBeer, Beer.class);
//        }
//
//        //This won't actually work as we can't post to the beer API, still functional syntax though. You can remove
//        //the headers part if you don't need it.
//        @RequestMapping(method = RequestMethod.POST, value = "/beer")
//        public Object beerPost(){
//            HttpHeaders headers = new HttpHeaders();
//            headers.add("Basic-Auth", "examplekey");
//            ThirdPartyRequest callBeer = new ThirdPartyRequest(
//                    "http://api.brewerydb.com/v2/beer/random?key=47dd1ef7d420f2f8b23998fabfbc336e", HttpMethod.POST);
//            return handler.callAPI(callBeer,"Body of the request", String.class, headers);
//        }
//    }






