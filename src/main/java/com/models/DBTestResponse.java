package com.models;

/**
 * Created by tdavis on 5/8/17.
 */
/*
* This is a test response object. This needs to be rewritten as generic
*/
public class DBTestResponse {

    //response from http call (sql query)
    private Object response;
    //status code from http call
    private String status;

    public DBTestResponse() {
    }

    public DBTestResponse(Object response, String status) {
        this.response = response;
        this.status = status;
    }

    public Object getResponse() {
        return response;
    }

    public void setResponse(Object response) {
        this.response = response;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
