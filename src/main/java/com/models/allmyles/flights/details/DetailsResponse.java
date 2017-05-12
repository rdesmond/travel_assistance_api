package com.models.allmyles.flights.details;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 Response Codes

 404 ‘search first’

 412 ‘a request is already being processed’: This error comes up even when the other request is asynchronous (i.e. when
 we are still processing a search request). The response for async requests does not need to be retrieved for this
 error to clear, just wait a few seconds.

 412 ‘request is not for the latest search’: One case where this error is returned is when a customer is using multiple
 tabs and trying to select a flight from an old result list.
 */

/**
 Request

 GET /flights/:booking_id

 booking_id is the booking ID of the Combination to get the details of
 */

@JsonIgnoreProperties(ignoreUnknown = true)
public class DetailsResponse {
    //root container
    FlightDetails flightDetails;

    public FlightDetails getFlightDetails() {
        return flightDetails;
    }

    public void setFlightDetails(FlightDetails flightDetails) {
        this.flightDetails = flightDetails;
    }

    @Override
    public String toString() {
        return "DetailsResponse{" +
                "flightDetails=" + flightDetails +
                '}';
    }
}