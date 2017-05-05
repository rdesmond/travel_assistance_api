package com.models.allmyles.flights.search_flights.request;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Filters {
    String cabin;
    boolean direct_flights_only;

    public String getCabin() {
        return cabin;
    }

    public void setCabin(String cabin) {
        this.cabin = cabin;
    }

    public boolean isDirect_flights_only() {
        return direct_flights_only;
    }

    public void setDirect_flights_only(boolean direct_flights_only) {
        this.direct_flights_only = direct_flights_only;
    }

    @Override
    public String toString() {
        return "Filters{" +
                "cabin='" + cabin + '\'' +
                ", direct_flights_only=" + direct_flights_only +
                '}';
    }
}