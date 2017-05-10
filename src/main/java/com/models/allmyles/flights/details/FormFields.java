package com.models.allmyles.flights.details;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.Arrays;

/**
 Form fields define criteria for field validation, making it easy to generate HTML form elements.
 */

@JsonIgnoreProperties(ignoreUnknown = true)
public class FormFields {
    //contains validation data for Passenger fields
    FormField[] passengers;

    //contains validation data for Contact Info fields
    FormField[] contactInfo;

    //contains validation data for Billing Info fields
    FormField[] billingInfo;


    public FormField[] getPassengers() {
        return passengers;
    }

    public void setPassengers(FormField[] passengers) {
        this.passengers = passengers;
    }

    public FormField[] getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(FormField[] contactInfo) {
        this.contactInfo = contactInfo;
    }

    public FormField[] getBillingInfo() {
        return billingInfo;
    }

    public void setBillingInfo(FormField[] billingInfo) {
        this.billingInfo = billingInfo;
    }


    @Override
    public String toString() {
        return "FormFields{" +
                "passengers=" + Arrays.toString(passengers) +
                ", contactInfo=" + Arrays.toString(contactInfo) +
                ", billingInfo=" + Arrays.toString(billingInfo) +
                '}';
    }
}