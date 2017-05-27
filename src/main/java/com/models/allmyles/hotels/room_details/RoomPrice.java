package com.models.allmyles.hotels.room_details;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class RoomPrice {
    //The total cost of booking the hotel for the guest. This includes the charge we require right now.
    float total;

    //The amount of money we need to charge the guest to complete the booking. If this amount is zero, no transaction
    // needs to be made and you can go on to booking straight away.
    float charge;


    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public float getCharge() {
        return charge;
    }

    public void setCharge(float charge) {
        this.charge = charge;
    }


    @Override
    public String toString() {
        return "RoomPrice{" +
                "total=" + total +
                ", charge=" + charge +
                '}';
    }
}