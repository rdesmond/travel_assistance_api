package com.models.allmyles.flights.booking.request;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.models.allmyles.flights.search.request.UserData;
import java.util.Arrays;

/**
 Note

 When booking LCC flights, there are two possible scenarios. By default, the Allmyles API does not send the book request
 to the external provider until the ticketing call arrives, so there’s no response—an HTTP 204 No Content status code is
 returned. If you have chosen alternative providers (you have to contact the Allmyles support about this first), the
 booking flow of LCC flights is very similar to that of traditional flights. In this case the book response differs just
 a bit from the traditional book response - please refer to the book response specifications for detailed information.
 */

@JsonIgnoreProperties(ignoreUnknown = true)
public class BookingRequest {
    //the booking ID of the Combination to book
    String bookBasket;

    //billing info for ticket creation
    Billing billingInfo;

    //contact info for ticket creation
    Contact contactInfo;

    //the list of passengers
    Passenger[] persons;

    //information about the end user
    UserData userData;

    //ID of the booking on the tenant’s side - can be useful for debugging purposes
    String tenantReferenceId;


    public String getBookBasket() {
        return bookBasket;
    }

    public void setBookBasket(String bookBasket) {
        this.bookBasket = bookBasket;
    }

    public Billing getBillingInfo() {
        return billingInfo;
    }

    public void setBillingInfo(Billing billingInfo) {
        this.billingInfo = billingInfo;
    }

    public Contact getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(Contact contactInfo) {
        this.contactInfo = contactInfo;
    }

    public Passenger[] getPersons() {
        return persons;
    }

    public void setPersons(Passenger[] persons) {
        this.persons = persons;
    }

    public UserData getUserData() {
        return userData;
    }

    public void setUserData(UserData userData) {
        this.userData = userData;
    }

    public String getTenantReferenceId() {
        return tenantReferenceId;
    }

    public void setTenantReferenceId(String tenantReferenceId) {
        this.tenantReferenceId = tenantReferenceId;
    }


    @Override
    public String toString() {
        return "BookingRequest{" +
                "bookBasket='" + bookBasket + '\'' +
                ", billingInfo=" + billingInfo +
                ", contactInfo=" + contactInfo +
                ", persons=" + Arrays.toString(persons) +
                ", userData=" + userData +
                ", tenantReferenceId='" + tenantReferenceId + '\'' +
                '}';
    }
}