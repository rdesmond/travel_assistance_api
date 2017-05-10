package com.models.allmyles.common.booking.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.models.allmyles.common.booking.request.Contact;
import com.models.allmyles.flights.details.Price;
import com.models.allmyles.flights.search.response.FlightResult;

/**
 * Created by yovaliceroman on 5/10/17.
 */

@JsonIgnoreProperties(ignoreUnknown = true)
public class BookingResponse {

    String confirmation;
    String pnr;
    Price price;
    String lastTicketingDate;
    String bookingReferenceId;
    Contact contactInfo;
    FlightResult flightData;

    public String getConfirmation() {
        return confirmation;
    }

    public void setConfirmation(String confirmation) {
        this.confirmation = confirmation;
    }

    public String getPnr() {
        return pnr;
    }

    public void setPnr(String pnr) {
        this.pnr = pnr;
    }

    public Price getPrice() {
        return price;
    }

    public void setPrice(Price price) {
        this.price = price;
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
                "confirmation='" + confirmation + '\'' +
                "pnr='" + pnr + '\'' +
                "price='" + price + '\'' +
                "lastTicketingDate='" + lastTicketingDate + '\'' +
                "bookingReferenceId='" + bookingReferenceId + '\'' +
                "contactInfo='" + contactInfo + '\'' +
                "flightData='" + flightData +
                '}';
    }
}
