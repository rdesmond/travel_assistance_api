package com.models.allmyles.flights.payment;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.Arrays;

/**
 * This is where Allmyles gets the payment data.

 Allmyles is a payment platform agnostic solution. When we receive a transaction ID that points to a successful payment
 by the passenger, we essentially take that money from any Payment Service Provider (PSP), and forward it to the provider
 to buy a ticket in the Ticketing step.
 */

/**
 Response Body

 N/A:

 Returns an HTTP 204 No Content status code if successful.

 Response Codes

 412 ‘a request is already being processed’: This error comes up even when the other request is asynchronous (i.e. when
 we are still processing a search request). The response for async requests does not need to be retrieved for this error
 to clear, just wait a few seconds.

 412 ‘book request should have been received’

 */

@JsonIgnoreProperties(ignoreUnknown = true)
public class PaymentRequest {
    //the transaction ID identifying the successful transaction at your PSP
    String paymentId;

    //the booking IDs the payment is for
    String[] basket;


    public String getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(String paymentId) {
        this.paymentId = paymentId;
    }

    public String[] getBasket() {
        return basket;
    }

    public void setBasket(String[] basket) {
        this.basket = basket;
    }


    @Override
    public String toString() {
        return "PaymentRequest{" +
                "paymentId='" + paymentId + '\'' +
                ", basket=" + Arrays.toString(basket) +
                '}';
    }
}