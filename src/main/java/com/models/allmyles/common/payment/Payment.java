package com.models.allmyles.common.payment;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.Arrays;

/**
 * Created by yovaliceroman on 5/9/17.
 */

@JsonIgnoreProperties(ignoreUnknown = true)
public class Payment {

    String payuId;
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
        return "Payment{" +
                "payuID='" + payuId + '\'' +
                "basket='" + Arrays.toString(basket) +
                '}';
    }
}
