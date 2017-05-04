package com.apis;

import org.springframework.http.HttpMethod;

/**
 * @author cass
 */
public class ThirdPartyRequest {

    private String url;
    private HttpMethod requestType; //GET, HEAD, POST, PUT, PATCH, DELETE, OPTIONS, TRACE;

    public ThirdPartyRequest(String url, HttpMethod requestType) {
        super();
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
