package com.apis;

import org.springframework.http.HttpStatus;

/** Generic class that is used as a return type for methods in the Resource class
 * This allows the HTTP request to return an object, a status, and a message
 * @param <T>
 * @author cass
 */
public class APIResponse<T> {

    private Object data;
    private HttpStatus status;
    private String message;

    //Constructor used when data is retrieved
    public APIResponse(HttpStatus status, T data) {
        this.status = status;
        this.data = data;
        this.message = status.getReasonPhrase();
    }
    //Constructor used when only status and a custom message are needed
    public APIResponse(HttpStatus status, String message){
        this.status = status;
        this.message = message;
    }
    //Constructor used when only status and pre-selected message are needed
    public APIResponse(HttpStatus status){
        this.status = status;
        this.message = status.getReasonPhrase();
    }
    public HttpStatus getStatus() {
        return status;
    }

    public String getMessage() {
        return message;
    }

    public Object getData() {
        return data;
    }
}

