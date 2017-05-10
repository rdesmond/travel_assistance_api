package com.models.allmyles.flights.booking.request;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Passenger {
    //format is YYYY-MM-DD
    String birthDate;

    //data about the identifying document the passenger wishes to travel with
    Document document;

    String email;

    //one of Mr, Ms, or Mrs
    String namePrefix;

    String firstName;

    //(optional)
    String middleName;

    String lastName;

    //one of MALE or FEMALE
    String gender;

    //one of PassengerTypes
    String passengerTypeCode;

    //one of the tier IDs returned in the flight details response
    String baggage;

    //one of the tier IDs returned in the flight details response
    String carryOnBaggage;


    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public Document getDocument() {
        return document;
    }

    public void setDocument(Document document) {
        this.document = document;
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

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
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

    public String getCarryOnBaggage() {
        return carryOnBaggage;
    }

    public void setCarryOnBaggage(String carryOnBaggage) {
        this.carryOnBaggage = carryOnBaggage;
    }


    @Override
    public String toString() {
        return "Passenger{" +
                "birthDate='" + birthDate + '\'' +
                ", document=" + document +
                ", email='" + email + '\'' +
                ", namePrefix='" + namePrefix + '\'' +
                ", firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender='" + gender + '\'' +
                ", passengerTypeCode='" + passengerTypeCode + '\'' +
                ", baggage='" + baggage + '\'' +
                ", carryOnBaggage='" + carryOnBaggage + '\'' +
                '}';
    }
}