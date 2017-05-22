package com.models.allmyles.hotels.search;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Hotel {
    String hotel_id;

    String hotel_name;

    String chain_name;

    //An associative array mapping each amenity
    Amenities amenities;

    // //The latitude component of the coordinates of the hotel
    float latitude;

    //The longitude component of the coordinates of the hotel
    float longitude;

    Price max_rate;

    Price min_rate;

    //The amount of stars the hotel has been awarded
    int stars;

    //Link to a small image representing the hotel
    String thumbnail;

    //The distance form the city center in kilometers
    float distance;


    public String getHotel_id() {
        return hotel_id;
    }

    public void setHotel_id(String hotel_id) {
        this.hotel_id = hotel_id;
    }

    public String getHotel_name() {
        return hotel_name;
    }

    public void setHotel_name(String hotel_name) {
        this.hotel_name = hotel_name;
    }

    public String getChain_name() {
        return chain_name;
    }

    public void setChain_name(String chain_name) {
        this.chain_name = chain_name;
    }

    public Amenities getAmenities() {
        return amenities;
    }

    public void setAmenities(Amenities amenities) {
        this.amenities = amenities;
    }

    public float getLatitude() {
        return latitude;
    }

    public void setLatitude(float latitude) {
        this.latitude = latitude;
    }

    public float getLongitude() {
        return longitude;
    }

    public void setLongitude(float longitude) {
        this.longitude = longitude;
    }

    public Price getMax_rate() {
        return max_rate;
    }

    public void setMax_rate(Price max_rate) {
        this.max_rate = max_rate;
    }

    public Price getMin_rate() {
        return min_rate;
    }

    public void setMin_rate(Price min_rate) {
        this.min_rate = min_rate;
    }

    public int getStars() {
        return stars;
    }

    public void setStars(int stars) {
        this.stars = stars;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public float getDistance() {
        return distance;
    }

    public void setDistance(float distance) {
        this.distance = distance;
    }

    @Override
    public String toString() {
        return "TripHotel{" +
                "amenities=" + amenities +
                ", chain_name='" + chain_name + '\'' +
                ", hotel_id='" + hotel_id + '\'' +
                ", hotel_name='" + hotel_name + '\'' +
                ", latitude=" + latitude +
                ", longitude=" + longitude +
                ", max_rate=" + max_rate +
                ", min_rate=" + min_rate +
                ", stars=" + stars +
                ", thumbnail='" + thumbnail + '\'' +
                ", distance=" + distance +
                '}';
    }
}