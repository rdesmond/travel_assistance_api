package com.models.allmyles.flights.search.request;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Filters {
    //One of economy, premium economy, business or first. Filtering for a certain cabin returns combinations that
    // contain at least one leg with the desired cabin type.
    String cabin;


    public String getCabin() {
        return cabin;
    }

    public void setCabin(String cabin) {
        this.cabin = cabin;
    }


    @Override
    public String toString() {
        return "Filters{" +
                "cabin='" + cabin + '\'' +
                '}';
    }
}