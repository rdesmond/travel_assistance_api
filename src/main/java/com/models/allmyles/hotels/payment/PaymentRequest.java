package com.models.allmyles.hotels.payment;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.Arrays;

/**
 If payment is required—that is, if the room’s charge field was not zero—this is where Allmyles gets the payment data.

 The only supported payment provider at the moment is PayU. When we receive a transaction ID that points to a successful
 payment by the passenger, we essentially take that money from PayU, and forward it to the provider to book a hotel room
 in the Booking step.
 */

/**
 Response Body
 N/A:

 Returns an HTTP 204 No Content status code if successful.
 */

/**
 Response Codes

 412 ‘a request is already being processed’: This error comes up even when the other request is asynchronous (i.e. when
 we are still processing a search request). The response for async requests does not need to be retrieved for this error
 to clear, just wait a few seconds.
 */

@JsonIgnoreProperties(ignoreUnknown = true)
public class PaymentRequest {
    //the transaction ID identifying the successful transaction at PayU
    String payuId;

    //the booking IDs the payment is for
    String[] basket;


    public String getPayuId() {
        return payuId;
    }

    public void setPayuId(String payuId) {
        this.payuId = payuId;
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
                "payuId='" + payuId + '\'' +
                ", basket=" + Arrays.toString(basket) +
                '}';
    }
}