package com.models.allmyles.flights.booking.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.models.allmyles.flights.booking.request.Contact;
import com.models.allmyles.flights.details.Price;
import com.models.allmyles.flights.search.response.FlightResult;

/**
 Note

 Again: by default, there’s no response body for LCC book requests! An HTTP 204 No Content status code confirms that
 Allmyles saved the sent data for later use.

 Warning

 If you have chosen alternative providers - that means there IS a book response for LCC flights, this is the response
 that contains the exact final price that should be shown to the traveler. This price contains the baggage and hand
 luggage surcharges, if applicable.

 Warning

 The format of Contact and FlightResult objects contained within this response might slightly differ from what’s
 described in this documentation as requested. This will be fixed in a later version.
 */

/**
 Response Codes

 303 ‘Unable to book this flight - please select a different bookingId’: This error is returned when the external
 provider encounters a problem such as a discrepancy between actual flight data and what they returned from their cache
 before. This happens very rarely, or never in production.

 404 ‘search first’

 412 ‘a request is already being processed’: This error comes up even when the other request is asynchronous (i.e. when
 we are still processing a search request). The response for async requests does not need to be retrieved for this error
 to clear, just wait a few seconds.

 412 ‘Already booked.’: This denotes that either us or the external provider has detected a possible duplicate booking,
 and has broken the flow to avoid dupe payments.

 412 ‘already booked’: This is technically the same as the error above, but is encountered at a different point in the
 flow. The error messages are only temporarily not the same for these two errors.

 412 ‘request is not for the latest search’

 500 ‘could not book flight’: This is the generic error returned when we encounter an unknown/empty response from the
 external provider

 504 ‘external gateway timed out - book request might very well have been successful!’: The booking might, or might not
 have been completed in this case. The flow should be stopped, and the customer should be contacted to complete the
 booking.

 504 ‘Could not retrieve virtual credit card, flight not booked. An IRN should be sent to payment provider now.’
 */

@JsonIgnoreProperties(ignoreUnknown = true)
public class BookingResponse {
    //final price updated with baggage surcharges. Only in alternative LCC book response!
    Price price;

    //the PNR locator which identifies this booking
    String pnr;

    //the timestamp of when it’s last possible to create a ticket for the booking, in ISO format
    String lastTicketingDate;

    //the ID of the workflow at Allmyles; this is not currently required anywhere later, but can be useful for debugging
    String bookingReferenceId;

    //contains a copy of the data received in the Booking call
    Contact contactInfo;

    //contains a copy of the result from the search call’s response
    FlightResult flightData;


    public Price getPrice() {
        return price;
    }

    public void setPrice(Price price) {
        this.price = price;
    }

    public String getPnr() {
        return pnr;
    }

    public void setPnr(String pnr) {
        this.pnr = pnr;
    }

    public String getLastTicketingDate() {
        return lastTicketingDate;
    }

    public void setLastTicketingDate(String lastTicketingDate) {
        this.lastTicketingDate = lastTicketingDate;
    }

    public String getBookingReferenceId() {
        return bookingReferenceId;
    }

    public void setBookingReferenceId(String bookingReferenceId) {
        this.bookingReferenceId = bookingReferenceId;
    }

    public Contact getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(Contact contactInfo) {
        this.contactInfo = contactInfo;
    }

    public FlightResult getFlightData() {
        return flightData;
    }

    public void setFlightData(FlightResult flightData) {
        this.flightData = flightData;
    }


    @Override
    public String toString() {
        return "BookingResponse{" +
                "price=" + price +
                ", pnr='" + pnr + '\'' +
                ", lastTicketingDate='" + lastTicketingDate + '\'' +
                ", bookingReferenceId='" + bookingReferenceId + '\'' +
                ", contactInfo=" + contactInfo +
                ", flightData=" + flightData +
                '}';
    }
}