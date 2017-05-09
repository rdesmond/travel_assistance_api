package com.models.allmyles.flights.search.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.Arrays;

//Legs are made up of one or more segments, and span from one location the customer searched for to the other.

@JsonIgnoreProperties(ignoreUnknown = true)
public class Leg {
    //The total time between the leg’s first departure, and last arrival (including time spent waiting when
    // transferring). It is given in the format HHMM.
    String elapsedTime;

    //The list of segments this leg is made up of.
    Segment[] flightSegments;


    public String getElapsedTime() {
        return elapsedTime;
    }

    public void setElapsedTime(String elapsedTime) {
        this.elapsedTime = elapsedTime;
    }

    public Segment[] getFlightSegments() {
        return flightSegments;
    }

    public void setFlightSegments(Segment[] flightSegments) {
        this.flightSegments = flightSegments;
    }


    @Override
    public String toString() {
        return "Leg{" +
                "elapsedTime='" + elapsedTime + '\'' +
                ", flightSegments=" + Arrays.toString(flightSegments) +
                '}';
    }
}