package com.models.allmyles.flights.search.response;

import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SearchResult {
    // root container
    FlightResult[] flightResultSet;


    public FlightResult[] getFlightResultSet() {
        return flightResultSet;
    }

    public void setFlightResultSet(FlightResult[] flightResultSet) {
        this.flightResultSet = flightResultSet;
    }


    @Override
    public String toString() {
        return "SearchResult{" +
                "flightResultSet=" + Arrays.toString(flightResultSet) +
                '}';
    }
}