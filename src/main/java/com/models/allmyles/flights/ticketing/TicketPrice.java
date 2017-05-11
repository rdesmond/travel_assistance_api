package com.models.allmyles.flights.ticketing;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class TicketPrice {
    String currency;

    //The total amount of money the passenger paid for his ticket, including tax.
    Float total_fare;

    //The total amount of tax the passenger had to pay for this ticket.
    Float tax;


    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Float getTotal_fare() {
        return total_fare;
    }

    public void setTotal_fare(Float total_fare) {
        this.total_fare = total_fare;
    }

    public Float getTax() {
        return tax;
    }

    public void setTax(Float tax) {
        this.tax = tax;
    }


    @Override
    public String toString() {
        return "TicketPrice{" +
                "currency='" + currency + '\'' +
                ", total_fare=" + total_fare +
                ", tax=" + tax +
                '}';
    }
}