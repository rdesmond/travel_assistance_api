package com.models.internal;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.deser.std.StringDeserializer;

/** Internal model for flights table in database. Use with Trip model.
 * @author cass
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TripFlight {

    private int id;
    private String fromLocation;
    private String toLocation;
    private String departureDate;
    private String returnDate;
    private int trip_id;
    //not yet created in database - this will contain the id of the actual booking
    private int bookingId;

}
