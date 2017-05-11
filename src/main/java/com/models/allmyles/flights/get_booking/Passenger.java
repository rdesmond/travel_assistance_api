package com.models.allmyles.flights.get_booking;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Passenger {
    //format is YYYY-MM-DD
    String birth_date;

    //the ticket number which allows the passenger to actually board the plane (or null if flight is LCC)
    String traditional_ticket;

    //one of PassengerTypes
    String type;

    String email;

    //the name of the passenger the booking was made for
    String name;


    public String getBirth_date() {
        return birth_date;
    }

    public void setBirth_date(String birth_date) {
        this.birth_date = birth_date;
    }

    public String getTraditional_ticket() {
        return traditional_ticket;
    }

    public void setTraditional_ticket(String traditional_ticket) {
        this.traditional_ticket = traditional_ticket;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Passenger{" +
                "birth_date='" + birth_date + '\'' +
                ", traditional_ticket='" + traditional_ticket + '\'' +
                ", type='" + type + '\'' +
                ", email='" + email + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}