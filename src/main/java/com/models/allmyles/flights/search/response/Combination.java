package com.models.allmyles.flights.search.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.Arrays;

/**
 Combinations are the sets of different flight itineraries that can be booked. Every combination in a flight result
 is guaranteed to have the same total price, but the departure times, arrival times, and transfer locations can differ.
 */

@JsonIgnoreProperties(ignoreUnknown = true)
public class Combination {
    //the unique identifier of this combination (this is later used to identify the combination when booking, for example.)
    String bookingId;

    //the outbound leg of the itinerary
    Leg firstLeg;

    //the inbound leg of the itinerary
    Leg returnLeg;

    //ticket designator’s description
    Float serviceFeeAmount;

    /**
     Comfort score is a variable that indicates how comfortable each combination option is. It is based on different
     aspects of the flight, e.g.:

     Total time elapsed from first departure to last arrival
     Number of flight segments (Segment [ ])
     Cabin type
     Passenger capacity of aircrafts
     Red-eye flight status, meaning flight leaves or departs at an inconvenient time
     The time elapsed between flight segments
     */
    int comfortScore;

    //service fee converted to the client’s preferred currencies
    ServiceFeeInPreferredCurrencies[] service_fee_in_preferred_currencies;


    public String getBookingId() {
        return bookingId;
    }

    public void setBookingId(String bookingId) {
        this.bookingId = bookingId;
    }

    public Leg getFirstLeg() {
        return firstLeg;
    }

    public void setFirstLeg(Leg firstLeg) {
        this.firstLeg = firstLeg;
    }

    public Leg getReturnLeg() {
        return returnLeg;
    }

    public void setReturnLeg(Leg returnLeg) {
        this.returnLeg = returnLeg;
    }

    public Float getServiceFeeAmount() {
        return serviceFeeAmount;
    }

    public void setServiceFeeAmount(Float serviceFeeAmount) {
        this.serviceFeeAmount = serviceFeeAmount;
    }

    public int getComfortScore() { return comfortScore; }

    public void setComfortScore(int comfortScore) { this.comfortScore = comfortScore; }

    public ServiceFeeInPreferredCurrencies[] getService_fee_in_preferred_currencies() {
        return service_fee_in_preferred_currencies;
    }

    public void setService_fee_in_preferred_currencies(ServiceFeeInPreferredCurrencies[] service_fee_in_preferred_currencies) {
        this.service_fee_in_preferred_currencies = service_fee_in_preferred_currencies;
    }


    @Override
    public String toString() {
        return "Combination{" +
                "bookingId='" + bookingId + '\'' +
                ", firstLeg=" + firstLeg +
                ", returnLeg=" + returnLeg +
                ", serviceFeeAmount=" + serviceFeeAmount +
                ", comfortScore=" + comfortScore +
                ", service_fee_in_preferred_currencies=" + Arrays.toString(service_fee_in_preferred_currencies) +
                '}';
    }
}