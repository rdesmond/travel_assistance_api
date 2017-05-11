package com.models.allmyles.flights.ticketing_status;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.models.allmyles.flights.get_booking.PNR;

/**
 This call enables checking the result of a ticketing request. This is useful when it’s unclear whether the ticketing
 process went through, due to a failure at external providers, in Allmyles’ systems, on the client’s server, or anywhere
 in between. The request will identify the correct workflow based on the cookie header’s contents, which must match
 whatever was sent in the ticket request.

 If you’re using alternative providers and an LCC booking returns with the status pending or unknown, keep in mind that
 the ticket could still be created successfully in the next 72 hours. You should keep making periodic Ticketing Status
 requests at a reduced rated until a successful or failed status is returned or the 72-hour period is over.

 The periodic checks should be made at most once every 5 minutes.
 */

/**
 Available statuses

 inactive: this is the status returned when the ticketing process has not been initiated yet, i.e. before a Ticketing
 request is sent

 pending: the ticket creation is still in progress

 successful: the ticket has been successfully created. PNR data will be passed alongside this status, including the
 ticket number(s).

 failed: the ticket creation failed, and the fare can be refunded (do note that this is the only status in which refunds
 can be automatically made)

 unknown: it is not possible to programmatically determine the outcome of the request. The passenger’s money should be
 held until a human identifies the issue and determines whether the ticket exists or not.
 */

/**
 Request

 GET /tickets/:booking_id/status

 booking_id is the booking ID of the Combination whose ticket’s status we are interested in
 */

@JsonIgnoreProperties(ignoreUnknown = true)
public class TicketingStatusResponse {
    //one of the statuses
    String status;

    //the pnr object that a Get Booking request would return about the flight — this includes the ticket number(s) as well
    PNR pnr;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public PNR getPnr() {
        return pnr;
    }

    public void setPnr(PNR pnr) {
        this.pnr = pnr;
    }


    @Override
    public String toString() {
        return "TicketingStatusResponse{" +
                "status='" + status + '\'' +
                ", pnr=" + pnr +
                '}';
    }
}