package com.models.allmyles.common.booking.request;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by yovaliceroman on 5/9/17.
 */

@JsonIgnoreProperties(ignoreUnknown = true)
public class Person {

    String birthDate;
    String email;
    String namePrefix;
    String firstName;
    String lastName;
    String gender;
    String passengerTypeCode;
    String baggage;
    String outwardBaggage;
    String returnBaggage;
    String carryOnBaggageTier;
    String checkIn;
    String frequentFlyerCard;
    Document document;

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNamePrefix() {
        return namePrefix;
    }

    public void setNamePrefix(String namePrefix) {
        this.namePrefix = namePrefix;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPassengerTypeCode() {
        return passengerTypeCode;
    }

    public void setPassengerTypeCode(String passengerTypeCode) {
        this.passengerTypeCode = passengerTypeCode;
    }

    public String getBaggage() {
        return baggage;
    }

    public void setBaggage(String baggage) {
        this.baggage = baggage;
    }

    public String getOutwardBaggage() {
        return outwardBaggage;
    }

    public void setOutwardBaggage(String outwardBaggage) {
        this.outwardBaggage = outwardBaggage;
    }

    public String getReturnBaggage() {
        return returnBaggage;
    }

    public void setReturnBaggage(String returnBaggage) {
        this.returnBaggage = returnBaggage;
    }

    public String getCarryOnBaggageTier() {
        return carryOnBaggageTier;
    }

    public void setCarryOnBaggageTier(String carryOnBaggageTier) {
        this.carryOnBaggageTier = carryOnBaggageTier;
    }

    public String getCheckIn() {
        return checkIn;
    }

    public void setCheckIn(String checkIn) {
        this.checkIn = checkIn;
    }

    public String getFrequentFlyerCard() {
        return frequentFlyerCard;
    }

    public void setFrequentFlyerCard(String frequentFlyerCard) {
        this.frequentFlyerCard = frequentFlyerCard;
    }

    public Document getDocument() {
        return document;
    }

    public void setDocument(Document document) {
        this.document = document;
    }

    @Override
    public String toString() {
        return "Person{" +
                "birthDate='" + birthDate + '\'' +
                "email='" + email + '\'' +
                "namePrefix='" + namePrefix + '\'' +
                "firstName='" + firstName + '\'' +
                "lastName='" + lastName + '\'' +
                "gender='" + gender + '\'' +
                "passengerTypeCode='" + passengerTypeCode + '\'' +
                "baggage='" + baggage + '\'' +
                "outwardBaggage='" + outwardBaggage + '\'' +
                "returnBaggage='" + returnBaggage + '\'' +
                "carryOnBaggageTier='" + carryOnBaggageTier + '\'' +
                "checkIn='" + checkIn + '\'' +
                "frequentFlyerCard='" + frequentFlyerCard + '\'' +
                "document='" + document +
                '}';
    }
}
