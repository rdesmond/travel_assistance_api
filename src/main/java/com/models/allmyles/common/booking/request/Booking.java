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
    UserData userData;
    boolean speedyBoarding;
    String groupBaggage;
    String groupOutwardBaggage;
    String groupReturnBaggage;

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

    public UserData getUserData() {
        return userData;
    }

    public void setUserData(UserData userData) {
        this.userData = userData;
    }

    public boolean isSpeedyBoarding() {
        return speedyBoarding;
    }

    public void setSpeedyBoarding(boolean speedyBoarding) {
        this.speedyBoarding = speedyBoarding;
    }

    public String getGroupBaggage() {
        return groupBaggage;
    }

    public void setGroupBaggage(String groupBaggage) {
        this.groupBaggage = groupBaggage;
    }

    public String getGroupOutwardBaggage() {
        return groupOutwardBaggage;
    }

    public void setGroupOutwardBaggage(String groupOutwardBaggage) {
        this.groupOutwardBaggage = groupOutwardBaggage;
    }

    public String getGroupReturnBaggage() {
        return groupReturnBaggage;
    }

    public void setGroupReturnBaggage(String groupReturnBaggage) {
        this.groupReturnBaggage = groupReturnBaggage;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "bookBasket='" + Arrays.toString(bookBasket) + '\'' +
                "billingInfo='" + billingInfo + '\'' +
                "contactInfo='" + contactInfo + '\'' +
                "persons='" + Arrays.toString(persons) + '\'' +
                "userData='" + userData + '\'' +
                "speedyBoarding='" + speedyBoarding + '\'' +
                "groupBaggage='" + groupBaggage + '\'' +
                "groupOutwardBaggage='" + groupOutwardBaggage + '\'' +
                "groupReturnBaggage='" + groupReturnBaggage +
                '}';
    }
}
