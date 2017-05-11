package com.models.allmyles.flights.rules;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 This call returns the terms and conditions of the flight in question, or a link to them if the raw text isn’t available
 (in case of LCC flights).
 */

/**
 Request

 GET /flights/:booking_id/rules

 booking_id is the booking ID of the Combination to get the rules of
 */

/**
 Response Codes

 404 ‘search first’

 412 ‘a request is already being processed’: This error comes up even when the other request is asynchronous (i.e. when
 we are still processing a search request). The response for async requests does not need to be retrieved for this error
 to clear, just wait a few seconds.

 409 ‘request is not for the latest search’
 */

@JsonIgnoreProperties(ignoreUnknown = true)
public class RulesResponse {
    //root container
    RulesResultSet rulesResultSet;


    public RulesResultSet getRulesResultSet() {
        return rulesResultSet;
    }

    public void setRulesResultSet(RulesResultSet rulesResultSet) {
        this.rulesResultSet = rulesResultSet;
    }


    @Override
    public String toString() {
        return "RulesResponse{" +
                "rulesResultSet=" + rulesResultSet +
                '}';
    }
}