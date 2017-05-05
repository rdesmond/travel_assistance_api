package com.apis;

import org.springframework.http.HttpMethod;

/**
 * @author cass
 *
 * Document what to use this for
 */
public class ThirdPartyRequest {

    //this is the api url to call
    private String url;
    //GET, HEAD, POST, PUT, PATCH, DELETE, OPTIONS, TRACE;
    private HttpMethod requestType;

    public ThirdPartyRequest(String url, HttpMethod requestType) {
        this.url = url;
        this.requestType = requestType;
    }

    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url;
    }
    public HttpMethod getRequestType() {
        return requestType;
    }
    public void setRequestType(HttpMethod requestType) {
        this.requestType = requestType;
    }

    @Override
    public String toString() {
        return "RequestDetails [url=" + url + ", requestType=" + requestType + "]";
    }
}
