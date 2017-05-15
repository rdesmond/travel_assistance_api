package com.apis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.HttpServerErrorException;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;

/**
 * Generic class to call 3rd party APIs
 * It consists of a callAPI method that is overloaded several times and a is Successful method that throws exceptions
 *
 * See examples in the Example Package to see how to use this
 *
 * @param <T> the type of body, likely a string or POJO
 * @param <V> the model you want to map the response to
 *
 * @author cass
 */

@Service
public class GenericRequestHandler<T, V>{

    //This auto-creates an instance of RestTemplate which is Spring's central class for client-side HTTP access
    @Autowired
    private RestTemplate restTemplate;
    private HttpStatus status;

    /**
     * The callAPI method is used to make client-side API calls that return a response. It takes the API info provided
     * in a ThirdPartyRequest object and uses an instance of HttpEntity and ResponseEntity to return an object
     * of the specific type(V).
     * It is overloaded several times for use with or without headers and body.
     *
     * @param thirdPartyRequest - you'll need to create an instance of this class that contains the specific API details
     * @param pojoModelClass - the class you want the response returned to, which is passed to the restTemplate.exchange
     *                     method
     * @return - the body of the responseEntity - this is a object of the pojoModelClass specified above(V)
     * @throws RestClientException - this method calls the isSuccessful method to determine if an exception should be
     * thrown. You should use a try=catch to handle this.
     */
    // request with no headers or body
    public V callAPI(ThirdPartyRequest thirdPartyRequest, Class<V> pojoModelClass)
    throws RestClientException{

        HttpEntity<T> entity = new HttpEntity<T>(null,null);

        //Jackson2HttpMessageConverter mapping, support response type (application/text_plain)
        MappingJackson2HttpMessageConverter mappingJackson2HttpMessageConverter = new MappingJackson2HttpMessageConverter();
        mappingJackson2HttpMessageConverter.setSupportedMediaTypes(Arrays.asList(MediaType.APPLICATION_JSON, MediaType.TEXT_PLAIN));
        restTemplate.getMessageConverters().add(mappingJackson2HttpMessageConverter);

        ResponseEntity<V> response = restTemplate.exchange(thirdPartyRequest.getUrl(), thirdPartyRequest.getRequestType(),
                entity, pojoModelClass);
        status = response.getStatusCode();
        try {
            if (isSuccessful(status))
                return response.getBody();
            else throw new RestClientException(status.getReasonPhrase());
        }
             catch (RestClientException e) {
                throw e;
        }
    }
    /** @param requestBody - body of the request that gets passed to the HttpEntity constructor
     */
    // request with body, no headers
    public V callAPI(ThirdPartyRequest thirdPartyRequest, T requestBody, Class<V> pojoModelClass) {

        HttpEntity<T> entity = new HttpEntity<T>(requestBody);

        //Jackson2HttpMessageConverter mapping, support response type (application/text_plain)
        MappingJackson2HttpMessageConverter mappingJackson2HttpMessageConverter = new MappingJackson2HttpMessageConverter();
        mappingJackson2HttpMessageConverter.setSupportedMediaTypes(Arrays.asList(MediaType.APPLICATION_JSON, MediaType.TEXT_PLAIN));
        restTemplate.getMessageConverters().add(mappingJackson2HttpMessageConverter);

        ResponseEntity<V> response = restTemplate.exchange(thirdPartyRequest.getUrl(), thirdPartyRequest.getRequestType(),
                entity, pojoModelClass);
        status = response.getStatusCode();
        try {
            if (isSuccessful(status))
                return response.getBody();
            else throw new RestClientException(status.getReasonPhrase());
        }
        catch (RestClientException e) {
            throw e;
        }
    }

    /** @param headers - an instance of HttpHeaders that consists of a name and value
     */
    // request with headers, no body
    public V callAPI(ThirdPartyRequest thirdPartyRequest, Class<V> pojoModelClass, HttpHeaders headers){

        HttpEntity<T> entity = new HttpEntity<T>(headers);

        //Jackson2HttpMessageConverter mapping, support response type (application/text_plain)
        MappingJackson2HttpMessageConverter mappingJackson2HttpMessageConverter = new MappingJackson2HttpMessageConverter();
        mappingJackson2HttpMessageConverter.setSupportedMediaTypes(Arrays.asList(MediaType.APPLICATION_JSON, MediaType.TEXT_PLAIN));
        restTemplate.getMessageConverters().add(mappingJackson2HttpMessageConverter);

        ResponseEntity<V> response = restTemplate.exchange(thirdPartyRequest.getUrl(), thirdPartyRequest.getRequestType(),
                entity, pojoModelClass);
        status = response.getStatusCode();
        try {
            if (isSuccessful(status))
                return response.getBody();
            else throw new RestClientException(status.getReasonPhrase());
        }
        catch (RestClientException e) {
            throw e;
        }
    }
    // request with body and headers
    public V callAPI(ThirdPartyRequest thirdPartyRequest, T requestBody, Class<V> pojoModelClass, HttpHeaders headers){

        HttpEntity<T> entity = new HttpEntity<T>(requestBody, headers);

        //Jackson2HttpMessageConverter mapping, support response type (application/text_plain)
        MappingJackson2HttpMessageConverter mappingJackson2HttpMessageConverter = new MappingJackson2HttpMessageConverter();
        mappingJackson2HttpMessageConverter.setSupportedMediaTypes(Arrays.asList(MediaType.APPLICATION_JSON, MediaType.TEXT_PLAIN));
        restTemplate.getMessageConverters().add(mappingJackson2HttpMessageConverter);

        ResponseEntity<V> response = restTemplate.exchange(thirdPartyRequest.getUrl(), thirdPartyRequest.getRequestType(),
                entity, pojoModelClass);
        status = response.getStatusCode();
        try {
            if (isSuccessful(status))
                return response.getBody();
            else throw new RestClientException(status.getReasonPhrase());
        }
        catch (RestClientException e) {
            throw e;
        }
    }
    /**
     * used to determine if the request was successful and throw appropriate exception if not
     * @param status HttpStatus enum passed from the ResponseEntity object
     * @return true if status is 2xx, else false
     * @throws RestClientException - super class for the client and server exceptions also used, you can catch just
     * the RestClientException and handle all errors the same, or you can use more specific logic based on
     * client/server error.
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
    // getters and setters
    public RestTemplate getRestTemplate() {
        return restTemplate;
    }
    public HttpStatus getStatus() {
        return status;
    }
    public void setStatus(HttpStatus status) {
        this.status = status;
    }
    // default Constructor
    public GenericRequestHandler() {
    }
}








