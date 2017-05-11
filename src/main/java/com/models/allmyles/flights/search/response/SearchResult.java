package com.models.allmyles.flights.search.response;

import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 Response Codes:

 404 ‘No flights available’

 404 ‘No flight found for return leg’

 404 ‘search does not include a required country’ - It is possible to set rules to disallow search queries that don’t
 include a specific country in the itinerary. If a search request doesn’t match the set filter, this is returned

 500 ‘external provider rejected the request - please try again’: This is the generic error sent when we receive an
 unknown error as response from the provider
 */

@JsonIgnoreProperties(ignoreUnknown = true)
public class SearchResult {
    //root container
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