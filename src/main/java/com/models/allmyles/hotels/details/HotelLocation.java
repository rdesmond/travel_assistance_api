package com.models.allmyles.hotels.details;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class HotelLocation {
    String country;

    String state;

    String city;

    String address;

    String zip_code;

    //one of: ‘north’, ‘east’, ‘south’, ‘west’, ‘downtown’, ‘airport’, ‘resort’
    String area;

    //one of: ‘boat’, ‘coach’, ‘train’, ‘free’, ‘helicopter’, ‘limousine’, ‘plane’, ‘rental car’, ‘taxi’, ‘subway’,
    // ‘walking’
    String recommended_transport;


    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

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

    public String getZip_code() {
        return zip_code;
    }

    public void setZip_code(String zip_code) {
        this.zip_code = zip_code;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getRecommended_transport() {
        return recommended_transport;
    }

    public void setRecommended_transport(String recommended_transport) {
        this.recommended_transport = recommended_transport;
    }


    @Override
    public String toString() {
        return "HotelLocation{" +
                "country='" + country + '\'' +
                ", state='" + state + '\'' +
                ", city='" + city + '\'' +
                ", address='" + address + '\'' +
                ", zip_code='" + zip_code + '\'' +
                ", area='" + area + '\'' +
                ", recommended_transport='" + recommended_transport + '\'' +
                '}';
    }
}