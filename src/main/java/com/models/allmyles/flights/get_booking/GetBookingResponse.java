package com.models.allmyles.flights.get_booking;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 This call returns the details of a booking identified by a PNR locator. This makes it possible to re-open an expired
 session and send a ticketing request based on the PNR locator after the initial session is closed.
 */

/**
 Request

 GET /books/:pnr_locator

 pnr_locator is a unique identifier of the booking, received at the book response.
 */

/**
 Response Codes

 404 ‘PNR not found’

 403 ‘PNR belongs to another auth token’
 */

@JsonIgnoreProperties(ignoreUnknown = true)
public class GetBookingResponse {
    //root container
    PNR pnr;

    public PNR getPnr() {
        return pnr;
    }

    public void setPnr(PNR pnr) {
        this.pnr = pnr;
    }


    @Override
    public String toString() {
        return "GetBookingResponse{" +
                "pnr=" + pnr +
                '}';
    }
}