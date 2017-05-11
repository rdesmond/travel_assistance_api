package com.models.allmyles.hotels.room_details;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class RoomPrice {
    //The total cost of booking the hotel for the guest. This includes the charge we require right now.
    Float total;

    //The amount of money we need to charge the guest to complete the booking. If this amount is zero, no transaction
    // needs to be made and you can go on to booking straight away.
    Float charge;


    public Float getTotal() {
        return total;
    }

    public void setTotal(Float total) {
        this.total = total;
    }

    public Float getCharge() {
        return charge;
    }

    public void setCharge(Float charge) {
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