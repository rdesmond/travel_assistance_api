package com.models.allmyles.flights.search.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.Arrays;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Breakdown {
    //total price of the tickets for passengers of type (including tax)
    Float[] fare;

    //total tax on the tickets for passengers of type
    Float[] tax;

    //type of passengers the breakdown is for, see (see PassengerTypes)
    String type;

    //number of passengers of type
    int quantity;

    //ticket designators applicable for passengers of type
    TicketDesignator[] ticketDesignators;

    //fare converted to the client’s preferred currencies
    FareInPreferredCurrencies[] fare_in_preferred_currencies;


    public Float[] getFare() {
        return fare;
    }

    public void setFare(Float[] fare) {
        this.fare = fare;
    }

    public Float[] getTax() {
        return tax;
    }

    public void setTax(Float[] tax) {
        this.tax = tax;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public TicketDesignator[] getTicketDesignators() {
        return ticketDesignators;
    }

    public void setTicketDesignators(TicketDesignator[] ticketDesignators) {
        this.ticketDesignators = ticketDesignators;
    }

    public FareInPreferredCurrencies[] getFare_in_preferred_currencies() {
        return fare_in_preferred_currencies;
    }

    public void setFare_in_preferred_currencies(FareInPreferredCurrencies[] fare_in_preferred_currencies) {
        this.fare_in_preferred_currencies = fare_in_preferred_currencies;
    }


    @Override
    public String toString() {
        return "Breakdown{" +
                "fare=" + Arrays.toString(fare) +
                ", tax=" + Arrays.toString(tax) +
                ", type='" + type + '\'' +
                ", quantity=" + quantity +
                ", ticketDesignators=" + Arrays.toString(ticketDesignators) +
                ", fare_in_preferred_currencies=" + Arrays.toString(fare_in_preferred_currencies) +
                '}';
    }
}