package com.apis;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.models.DBTestModel;
import com.models.DBTestResponse;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.client.RestClientTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.*;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.client.MockRestServiceServer;
import org.springframework.test.web.client.ResponseCreator;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.HttpServerErrorException;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import static org.junit.Assert.*;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.method;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.requestTo;
import static org.springframework.test.web.client.response.MockRestResponseCreators.withStatus;
import static org.springframework.test.web.client.response.MockRestResponseCreators.withSuccess;

/**
 * @author cass
 *
 * Look up the best way to test third party api calls - you dont really want to hard code api keys in here
 * test all possible scenarios
 */
@RunWith(SpringRunner.class)
@RestClientTest(GenericRequestHandler.class)
public class GenericRequestHandlerTest <T, V> {

    @Autowired
    private GenericRequestHandler service;

    private MockRestServiceServer mockServer;
    private ThirdPartyRequest request;
//    private APIResponse response;
    private HttpHeaders headers = new HttpHeaders();

    @Before
    public void setUp()
            throws Exception{
        // Instantiate mock server with the RestTemplate to be tested
        mockServer = MockRestServiceServer.createServer(service.getRestTemplate());
    }

    @Test
    public void isSuccessfulTest()
            throws RestClientException {
        assertTrue(service.isSuccessful(HttpStatus.OK));
    }

    @Test(expected = HttpServerErrorException.class)
    public void generateHttpServerErrorException() {
        assertTrue(service.isSuccessful(HttpStatus.INTERNAL_SERVER_ERROR));
    }

    @Test(expected = HttpClientErrorException.class)
    public void generateHttpClientErrorException() {
        assertTrue(service.isSuccessful(HttpStatus.BAD_REQUEST));
    }

//    @Test
//    public void SuccessfulAPICall()
//            throws RestClientException {
//        // Create a ThirdPartyRequest to hold details
//        request = new ThirdPartyRequest("http://httpstat.us/200", HttpMethod.GET);
//                // Set the expectations on the request and mock the response to be returned
//        mockServer.expect(requestTo(request.getUrl()))
//                .andExpect(method(request.getRequestType()))
//                .andRespond(withSuccess("\"result\": \"success\" ", MediaType.APPLICATION_JSON_UTF8 ));
//        // call the method to be tested
//        APIResponse response = (APIResponse) service.callAPI(request, APIResponse.class);
//        // Junit assertions
//        assertEquals(200, response.getStatus());
//        // Call verify() method to ensure that expectations are being met
//        mockServer.verify();
//    }

    @Test
    public void UnSuccessfulAPICall()
            throws RestClientException {
        //test placeholder
    }
//    @Test
//    public void testGetMessage() {
//        mockServer.expect(requestTo("http://google.com"))
//                .andExpect(method(HttpMethod.GET))
//                .andRespond(withSuccess("resultSuccess", MediaType.TEXT_PLAIN));
//
//        String result = simpleRestService.getMessage();
//
//        mockServer.verify();
//        assertThat(result, allOf(containsString("SUCCESS"),
//                containsString("resultSuccess")));
//    }


    //Method
//    public V callAPI(ThirdPartyRequest thirdPartyRequest, Class<V> genericClass)
//            throws RestClientException{
//
//        HttpEntity<T> entity = new HttpEntity<T>(null,null);
//        ResponseEntity<V> response = restTemplate.exchange(thirdPartyRequest.getUrl(), thirdPartyRequest.getRequestType(),
//                entity, genericClass);
//        try {
//            if (isSuccessful(response.getStatusCode()))
//                return response.getBody();
//            else throw new RestClientException(response.getStatusCode().getReasonPhrase());
//        }
//        catch (RestClientException e) {
//            throw e;
//        }
//    }


}


