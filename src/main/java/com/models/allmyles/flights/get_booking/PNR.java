package com.models.allmyles.flights.get_booking;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.Arrays;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PNR {
    //the list of passengers
    Passenger[] passengers;

    //the PNR locator which identifies the booking
    String id;

    //the ticket number which allows the passenger to actually board the plane (or null if flight is traditional)
    String lcc_ticket;


    public Passenger[] getPassengers() {
        return passengers;
    }

    public void setPassengers(Passenger[] passengers) {
        this.passengers = passengers;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLcc_ticket() {
        return lcc_ticket;
    }

    public void setLcc_ticket(String lcc_ticket) {
        this.lcc_ticket = lcc_ticket;
    }


    @Override
    public String toString() {
        return "PNR{" +
                "passengers=" + Arrays.toString(passengers) +
                ", id='" + id + '\'' +
                ", lcc_ticket='" + lcc_ticket + '\'' +
                '}';
    }
}