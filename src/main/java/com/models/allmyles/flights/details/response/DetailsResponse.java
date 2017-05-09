package com.models.allmyles.flights.details.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

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