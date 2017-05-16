package com.models.allmyles.common.booking.request;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.Arrays;

/**
 * Created by yovaliceroman on 5/9/17.
 */

@JsonIgnoreProperties(ignoreUnknown = true)
public class Booking {

    String[] bookBasket;
    Contact billingInfo;
    Contact contactInfo;
    Person[] persons;

    public String[] getBookBasket() {
        return bookBasket;
    }

    public void setBookBasket(String[] bookBasket) {
        this.bookBasket = bookBasket;
    }

    public Contact getBillingInfo() {
        return billingInfo;
    }

    public void setBillingInfo(Contact billingInfo) {
        this.billingInfo = billingInfo;
    }

    public Contact getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(Contact contactInfo) {
        this.contactInfo = contactInfo;
    }

    public Person[] getPersons() {
        return persons;
    }

    public void setPersons(Person[] persons) {
        this.persons = persons;
    }


    @Override
    public String toString() {
        return "Booking{" +
                "bookBasket='" + Arrays.toString(bookBasket) + '\'' +
                "billingInfo='" + billingInfo + '\'' +
                "contactInfo='" + contactInfo + '\'' +
                "persons='" + Arrays.toString(persons) +
                '}';
    }
}
