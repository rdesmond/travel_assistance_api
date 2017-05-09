package com.models.allmyles.flights.search.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Airport {
    //the relevant terminal of the airport specified below (this will be null is the airport has only one terminal)
    String terminal;

    //official airport name of the specific stop
    String name;

    //the three letter IATA code of the airport the stop is at
    String code;


    public String getTerminal() {
        return terminal;
    }

    public void setTerminal(String terminal) {
        this.terminal = terminal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }


    @Override
    public String toString() {
        return "Airport{" +
                "terminal='" + terminal + '\'' +
                ", name='" + name + '\'' +
                ", code='" + code + '\'' +
                '}';
    }
}