package com.models.allmyles.flights.ticketing;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.models.allmyles.flights.booking.request.Contact;
import com.models.allmyles.flights.details.BaggageTier;
import com.models.allmyles.flights.details.CarryOnBaggageTier;
import com.models.allmyles.flights.search.response.FlightResult;
import java.util.Arrays;

/**
 Two important notes:

 Call this only when the passenger’s payment completely went through! (That is, after the payment provider’s IPN has
 arrived, confirming that the transaction did not get caught by the fraud protection filter.)

 After this call has been made do not issue refunds unless the Allmyles API explicitly tells you to. It’s way better to
 just correct ticketing errors manually than to fire automatic refunds even if the ticket purchase might already be
 locked in for some reason.
 */

/**
 Request

 GET /tickets/:booking_id

 booking_id is the booking ID of the Combination to create a ticket for
 */

/**
 Response Body
 By default, this is just an abstraction for the book call when buying an LCC ticket (there’s no separate book and
 ticketing calls for those flights). This means the response differs greatly depending on whether the flight is
 traditional or LCC booked through the default providers.

 If you have chosen alternative providers (you would have to contact the Allmyles support about this first), there is a
 separate book response for LCC flights, but the ticket response is the same as described below.
 */

/**
 Response Codes

 In case of errors (referring to response code 202 and 5xx), the client is expected to either have a correct the
 ticketing manually, or send periodic Ticketing Status requests until a definitive response is given (one of the
 following statuses: ‘successful’, ‘failed’, or ‘unknown’.) This should take no longer than 40 minutes. Tickets with an
 unknown status still require manual intervention.

 202 ‘Warning: e-ticket could not be issued due to technical difficulties. Please contact youragent.’: When this error
 occurs, the actual ticket is purchased, but an unknown error happens later on in the flow.

 412 ‘a request is already being processed’: This error comes up even when the other request is asynchronous (i.e. when
 we are still processing a search request). The response for async requests does not need to be retrieved for this error
 to clear, just wait a few seconds.

 412 ‘no payment data given’

 412 ‘book request should have been received’

 412 ‘book response should have been received’

 500 ‘booking failed, cannot create ticket’: This error is returned if the book response we last received from the
 provider contained an error.

 503 ‘error while creating ticket - please try again later’: This is the generic error we return when receiving an
 unknown response for the ticket request. No refund should be sent without manually checking if the ticket has been
 issued first.

 504 ‘ticket creation timed out - but could very well have been successful!’: Almost the same as above, refunds are
 definitely not safe in this case.
 */

@JsonIgnoreProperties(ignoreUnknown = true)
public class TicketingResponse {
    //JSON Parameters for traditional flights:

    //the purchased tickets
    Ticket[] tickets;

    //contains a copy of the result from the search call’s response
    FlightResult flightData;

    //contains a copy of the data received in the Booking call
    Contact contactInfo;


    //JSON Parameters for LCC flights:

    //the ticket number (LCC PNR) for this booking
    String ticket;

    //the PNR locator which identifies this booking
    String pnr;

    //the ID of the workflow at Allmyles; this is not currently required anywhere later, but can be useful for debugging
    String bookingReferenceId;

    //the baggage tier option the passenger has chosen
    BaggageTier[] baggageTiers;

    //the carry-on baggage tier option the passenger has chosen
    CarryOnBaggageTier[] carryOnBaggageTiers;


    public Ticket[] getTickets() {
        return tickets;
    }

    public void setTickets(Ticket[] tickets) {
        this.tickets = tickets;
    }

    public FlightResult getFlightData() {
        return flightData;
    }

    public void setFlightData(FlightResult flightData) {
        this.flightData = flightData;
    }

    public Contact getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(Contact contactInfo) {
        this.contactInfo = contactInfo;
    }

    public String getTicket() {
        return ticket;
    }

    public void setTicket(String ticket) {
        this.ticket = ticket;
    }

    public String getPnr() {
        return pnr;
    }

    public void setPnr(String pnr) {
        this.pnr = pnr;
    }

    public String getBookingReferenceId() {
        return bookingReferenceId;
    }

    public void setBookingReferenceId(String bookingReferenceId) {
        this.bookingReferenceId = bookingReferenceId;
    }

    public BaggageTier[] getBaggageTiers() {
        return baggageTiers;
    }

    public void setBaggageTiers(BaggageTier[] baggageTiers) {
        this.baggageTiers = baggageTiers;
    }

    public CarryOnBaggageTier[] getCarryOnBaggageTiers() {
        return carryOnBaggageTiers;
    }

    public void setCarryOnBaggageTiers(CarryOnBaggageTier[] carryOnBaggageTiers) {
        this.carryOnBaggageTiers = carryOnBaggageTiers;
    }


    @Override
    public String toString() {
        return "TicketingResponse{" +
                "tickets=" + Arrays.toString(tickets) +
                ", flightData=" + flightData +
                ", contactInfo=" + contactInfo +
                ", ticket='" + ticket + '\'' +
                ", pnr='" + pnr + '\'' +
                ", bookingReferenceId='" + bookingReferenceId + '\'' +
                ", baggageTiers=" + Arrays.toString(baggageTiers) +
                ", carryOnBaggageTiers=" + Arrays.toString(carryOnBaggageTiers) +
                '}';
    }
}