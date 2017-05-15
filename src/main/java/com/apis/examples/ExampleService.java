package com.apis.examples;

import com.apis.APIResponse;
import com.apis.GenericRequestHandler;
import com.apis.ThirdPartyRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClientException;

/**
 * This is an example of how to use the GenericRequestHandler, ThirdPartyRequest, and APIResponse to call an API and
 * return the response as an object.
 *
 * @author cass
 */
@Service
public class ExampleService {
    @Autowired
    private GenericRequestHandler<Object,Object> handler;
    @Autowired
    private APIResponse response;
    @Autowired
    private ThirdPartyRequest request;

    /**
     * Sends a get request to the specified URL and returns the data in an APIResponse object
     * @return APIResponse object
     */
    public APIResponse getAll() {
        // set thirdPartyRequest Url and HttpMethod
        request.setRequestType(HttpMethod.GET);
        request.setUrl("https://jsonplaceholder.typicode.com/posts");

        // set APIResponse body, status, and message depending on outcome of try-catch
        try {
            response.setBody(handler.callAPI(request, Object.class));
            response.setStatus(handler.getStatus());
        } catch (RestClientException httpError) {
            response.setStatus(handler.getStatus());
        } catch (Exception otherError){
            response.setMessage("Unable to process request: "+ otherError.getMessage());
        }
        // return APIResponse object to resource
        return response;
    }

    /**
     * Sends a post request to the specified URL with the body passed to it and returns the data in an APIResponse
     * object
     * @param body This could be a String or a POJO
     * @return APIResponse object
     */
    public APIResponse addNew(Object body) {
        // optional, create empty headers if needed
        HttpHeaders headers = new HttpHeaders();
        // add values to headers as "key", "value"
        headers.add("Basic-Auth", "examplekey");
        // set thirdPartyRequest Url and HttpMethod
        request.setRequestType(HttpMethod.GET);
        request.setUrl("http://jsonplaceholder.typicode.com/posts");

        // set APIResponse body, status, and message depending on outcome of try-catch
        try {
            response.setBody(handler.callAPI(request, body, Object.class, headers));
        } catch (RestClientException httpError) {
            response.setStatus(handler.getStatus());
        } catch (Exception otherError){
            response.setMessage("Unable to process request: "+ otherError.getMessage());
        }
        // return APIResponse object to resource
        return response;
    }
}
