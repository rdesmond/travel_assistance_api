package com.models.allmyles.flights.search.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

//Segments are the smallest unit of an itinerary. They are the direct flights the passenger will take from one stop
// to another.

@JsonIgnoreProperties(ignoreUnknown = true)
public class Segment {
    //data about the flight’s departure
    Stop departure;

    //data about the flight’s arrival
    Stop arrival;

    //Planned aircraft scheduled for the specific segment
    String aircraft;

    //the number of seats available for this price tier—the maximum number we can know of is 9, so when 9 is returned,
    // that means 9 or more seats are available.
    int availableSeats;

    //one of ‘economy’, ‘first’, or ‘business’
    String cabin;

    //an airline-specific identifier used in fare pricing. The code related to comfort score is cabin code.
    @JsonProperty("class")
    String classField;

    //two character IATA code of the marketing airline that publishes and markets the flight booked under its own
    // airline designator and flight number. The marketing airline should be displayed to travelers as the primary
    // airline.
    String marketingAirline;

    //two character IATA code of the airline operating this specific segment
    String operatingAirline;

    //The name of the airline that publishes and markets the flight booked under its own airline designator and flight
    // number
    String marketingAirlineName;

    //The airline operating this specific segment
    String operatingAirlineName;

    //the flight number for the specific flight, normally displayed as XXYYYY, where XX is the marketing airline’s code,
    // and YYYY is this number
    String flightNumber;


    public Stop getDeparture() {
        return departure;
    }

    public void setDeparture(Stop departure) {
        this.departure = departure;
    }

    public Stop getArrival() {
        return arrival;
    }

    public void setArrival(Stop arrival) {
        this.arrival = arrival;
    }

    public String getAircraft() {
        return aircraft;
    }

    public void setAircraft(String aircraft) {
        this.aircraft = aircraft;
    }

    public int getAvailableSeats() {
        return availableSeats;
    }

    public void setAvailableSeats(int availableSeats) {
        this.availableSeats = availableSeats;
    }

    public String getCabin() {
        return cabin;
    }

    public void setCabin(String cabin) {
        this.cabin = cabin;
    }

    public String getClassField() {
        return classField;
    }

    public void setClassField(String classField) {
        this.classField = classField;
    }

    public String getMarketingAirline() {
        return marketingAirline;
    }

    public void setMarketingAirline(String marketingAirline) {
        this.marketingAirline = marketingAirline;
    }

    public String getOperatingAirline() {
        return operatingAirline;
    }

    public void setOperatingAirline(String operatingAirline) {
        this.operatingAirline = operatingAirline;
    }

    public String getMarketingAirlineName() {
        return marketingAirlineName;
    }

    public void setMarketingAirlineName(String marketingAirlineName) {
        this.marketingAirlineName = marketingAirlineName;
    }

    public String getOperatingAirlineName() {
        return operatingAirlineName;
    }

    public void setOperatingAirlineName(String operatingAirlineName) {
        this.operatingAirlineName = operatingAirlineName;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }


    @Override
    public String toString() {
        return "Segment{" +
                "departure=" + departure +
                ", arrival=" + arrival +
                ", aircraft='" + aircraft + '\'' +
                ", availableSeats=" + availableSeats +
                ", cabin='" + cabin + '\'' +
                ", classField='" + classField + '\'' +
                ", marketingAirline='" + marketingAirline + '\'' +
                ", operatingAirline='" + operatingAirline + '\'' +
                ", marketingAirlineName='" + marketingAirlineName + '\'' +
                ", operatingAirlineName='" + operatingAirlineName + '\'' +
                ", flightNumber='" + flightNumber + '\'' +
                '}';
    }
}