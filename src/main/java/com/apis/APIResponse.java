package com.apis;

import org.springframework.http.HttpStatus;

/** Generic class that is used as a return type for methods in the Resource class
 * This allows the HTTP request to return an object, a status, and a message
 * Set as a @Bean in Application.java
 * @param <T>
 * @author cass
 */
public class APIResponse<T> {

    private Object body;
    private HttpStatus status;
    // The message is automatically set in the setStatus method.
    // If you want a custom message, make sure to set it after the status.
    private String message;

    // Constructor for body only
    public APIResponse(T body) {
        this.body = body;
        this.status = HttpStatus.OK;
        this.message = "Success";
    }
    // Constructor for body and status
    public APIResponse(T body, HttpStatus status) {
        this.body = body;
        this.status = status;
        this.message = status.getReasonPhrase();
    }
    // Constructor for body, status and custom message
    public APIResponse(T body, HttpStatus status,String message ) {
        this.body = body;
        this.status = status;
        this.message = message;
    }
    // Constructor for status only
    public APIResponse(HttpStatus status){
        this.status = status;
        this.message = status.getReasonPhrase();
    }
    // Constructor for status and custom message
    public APIResponse(HttpStatus status, String message){
        this.status = status;
        this.message = message;
    }
    // Constructor for custom message only
    public APIResponse(String  message){
        this.message = message;
    }
    // Empty Constructor
    public APIResponse(){
    }

    public Object getBody() {
        return body;
    }
    public void setBody(Object body) {
        this.body = body;
    }
    public HttpStatus getStatus() {
        return status;
    }
    // This will overwrite any previous message
    public void setStatus(HttpStatus status) {
        this.status = status;
        this.message = status.getReasonPhrase();
    }
    public String getMessage() {
        return message;
    }
    // This can be overwritten by te setStatus method
    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "APIResponse{" +
                "body=" + body +
                ", status=" + status +
                ", message='" + message + '\'' +
                '}';
    }
}
