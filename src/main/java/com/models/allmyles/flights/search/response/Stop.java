package com.models.allmyles.flights.search.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

//A stop is either the departure, or the arrival part of a segment.

@JsonIgnoreProperties(ignoreUnknown = true)
public class Stop {
    //time of the stop (in ISO format)
    String dateTime;

    //location of the stop
    Airport airport;

    // location city name of the stop
    City city;


    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    public Airport getAirport() {
        return airport;
    }

    public void setAirport(Airport airport) {
        this.airport = airport;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }


    @Override
    public String toString() {
        return "Stop{" +
                "dateTime='" + dateTime + '\'' +
                ", airport=" + airport +
                ", city=" + city +
                '}';
    }
}