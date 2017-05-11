package com.models.allmyles.flights.ticketing;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.Arrays;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Ticket {
    //the name of the passenger the ticket was purchased for
    String passenger;

    //one of PassengerTypes
    String passenger_type;

    //the ticket number which allows the passenger to actually board the plane
    String ticket;

    TicketPrice price;

    Baggage baggage;

    //the ticket price converted to the client’s preferred currencies
    TicketPrice[] price_in_preferred_currencies;


    public String getPassenger() {
        return passenger;
    }

    public void setPassenger(String passenger) {
        this.passenger = passenger;
    }

    public String getPassenger_type() {
        return passenger_type;
    }

    public void setPassenger_type(String passenger_type) {
        this.passenger_type = passenger_type;
    }

    public String getTicket() {
        return ticket;
    }

    public void setTicket(String ticket) {
        this.ticket = ticket;
    }

    public TicketPrice getPrice() {
        return price;
    }

    public void setPrice(TicketPrice price) {
        this.price = price;
    }

    public Baggage getBaggage() {
        return baggage;
    }

    public void setBaggage(Baggage baggage) {
        this.baggage = baggage;
    }

    public TicketPrice[] getPrice_in_preferred_currencies() {
        return price_in_preferred_currencies;
    }

    public void setPrice_in_preferred_currencies(TicketPrice[] price_in_preferred_currencies) {
        this.price_in_preferred_currencies = price_in_preferred_currencies;
    }


    @Override
    public String toString() {
        return "Ticket{" +
                "passenger='" + passenger + '\'' +
                ", passenger_type='" + passenger_type + '\'' +
                ", ticket='" + ticket + '\'' +
                ", price=" + price +
                ", baggage=" + baggage +
                ", price_in_preferred_currencies=" + Arrays.toString(price_in_preferred_currencies) +
                '}';
    }
}