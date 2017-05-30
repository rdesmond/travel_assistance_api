package com.models.internal;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.Date;

/** Internal model for cars table in database. Use with Trip model.
 * @author cass
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TripCar {

    private int id;
    private Date start_date;
    private Date end_date;
    private int trip_id;
    //not yet created in database - this will contain the id of the actual booking
    private int bookingId;
}
