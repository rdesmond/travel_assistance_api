package com.models.allmyles.cars.get_car_details.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by yovaliceroman on 5/9/17.
 */

@JsonIgnoreProperties(ignoreUnknown = true)
public class Location {

    String city;
    String address;
    String phone;
    String fax;
    String opens_at;
    String closes_at;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getOpens_at() {
        return opens_at;
    }

    public void setOpens_at(String opens_at) {
        this.opens_at = opens_at;
    }

    public String getCloses_at() {
        return closes_at;
    }

    public void setCloses_at(String closes_at) {
        this.closes_at = closes_at;
    }

    @Override
    public String toString() {
        return "Location{" +
                "city='" + city + '\'' +
                "address='" + address + '\'' +
                "phone='" + phone + '\'' +
                "fax='" + fax + '\'' +
                "opens_at='" + opens_at + '\'' +
                "closes_at='" + closes_at +
                '}';
    }
}
