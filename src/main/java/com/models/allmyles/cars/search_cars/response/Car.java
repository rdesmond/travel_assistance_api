package com.models.allmyles.cars.search_cars.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by yovaliceroman on 5/9/17.
 */

@JsonIgnoreProperties(ignoreUnknown = true)
public class Car {

    String vehicle_id;
    String vendor_id;
    String vendor_name;
    String vendor_code;
    boolean available;
    CarTraits traits;
    Price price;
    boolean unlimited;
    OverageFee overage_fee;

    public Car(){}

    public Car(String vehicle_id, String vendor_id, String vendor_name, String vendor_code, boolean available, CarTraits traits, Price price, boolean unlimited, OverageFee overage_fee) {
        this.vehicle_id = vehicle_id;
        this.vendor_id = vendor_id;
        this.vendor_name = vendor_name;
        this.vendor_code = vendor_code;
        this.available = available;
        this.traits = traits;
        this.price = price;
        this.unlimited = unlimited;
        this.overage_fee = overage_fee;
    }

    public String getVehicle_id() {
        return vehicle_id;
    }

    public void setVehicle_id(String vehicle_id) {
        this.vehicle_id = vehicle_id;
    }

    public String getVendor_id() {
        return vendor_id;
    }

    public void setVendor_id(String vendor_id) {
        this.vendor_id = vendor_id;
    }

    public String getVendor_name() {
        return vendor_name;
    }

    public void setVendor_name(String vendor_name) {
        this.vendor_name = vendor_name;
    }

    public String getVendor_code() {
        return vendor_code;
    }

    public void setVendor_code(String vendor_code) {
        this.vendor_code = vendor_code;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public CarTraits getTraits() {
        return traits;
    }

    public void setTraits(CarTraits traits) {
        this.traits = traits;
    }

    public Price getPrice() {
        return price;
    }

    public void setPrice(Price price) {
        this.price = price;
    }

    public boolean isUnlimited() {
        return unlimited;
    }

    public void setUnlimited(boolean unlimited) {
        this.unlimited = unlimited;
    }

    public OverageFee getOverage_fee() {
        return overage_fee;
    }

    public void setOverage_fee(OverageFee overage_fee) {
        this.overage_fee = overage_fee;
    }

    @Override
    public String toString() {
        return "Car{" +
                "available='" + available + '\'' +
                ", traits='" + traits + '\'' +
                ", vehicle_id='" + vehicle_id + '\'' +
                ", vendor_name='" + vendor_name + '\'' +
                ", overage_fee=" + overage_fee + '\'' +
                ", price='" + price + '\'' +
                ", vendor_id'=" + vendor_id + '\'' +
                ", unlimited='" + unlimited + '\'' +
                ", vendor_code='" + vendor_code +
                '}';
    }
}