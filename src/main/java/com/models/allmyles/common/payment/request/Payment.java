package com.models.allmyles.common.payment.request;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by yovaliceroman on 5/9/17.
 */

@JsonIgnoreProperties(ignoreUnknown = true)
public class Payment {

    String paymentId;
    String[] basket;
    FinalPrice finalPrice;

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

    public FinalPrice getFinalPrice() {
        return finalPrice;
    }

    public void setFinalPrice(FinalPrice finalPrice) {
        this.finalPrice = finalPrice;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "paymentID='" + paymentId + '\'' +
                "basket='" + basket + '\'' +
                "finalPrice='" + finalPrice +
                '}';
    }
}
