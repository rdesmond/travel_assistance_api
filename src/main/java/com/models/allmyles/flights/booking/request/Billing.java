package com.models.allmyles.flights.booking.request;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Billing {
    //address of the entity in question
    Address address;

    //email of the entity in question
    String email;

    //name of the entity in question, if the entity is an organization this is the only name field that is required
    String firstName;

    //(optional) submission of this parameter is mandatory if the person in question has a middle name and must not be
    // sent in if the entity in question is an organization
    String middleName;

    //(optional) submission of this parameter is mandatory if the entity in question is a person and it must not be
    // included if the entity is an organization
    String lastName;

    //phone number of the entity in question
    Phone phone;


    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public Phone getPhone() {
        return phone;
    }

    public void setPhone(Phone phone) {
        this.phone = phone;
    }


    @Override
    public String toString() {
        return "Billing{" +
                "address=" + address +
                ", email='" + email + '\'' +
                ", firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phone=" + phone +
                '}';
    }
}