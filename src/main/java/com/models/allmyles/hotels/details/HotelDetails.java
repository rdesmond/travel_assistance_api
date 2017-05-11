package com.models.allmyles.hotels.details;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.models.allmyles.hotels.search.Amenities;
import java.util.Arrays;

@JsonIgnoreProperties(ignoreUnknown = true)
public class HotelDetails {
    String chain_code;

    String chain_name;

    String hotel_code;

    String hotel_name;

    //contains info about the hotel’s location.
    HotelLocation location;

    //contains a list of notable locations around the hotel
    POI[] points_of_interest;

    //A short text describing the hotel
    String description;

    HotelContactInfo contact_info;

    //contains the lowest and highest rates available for a room at this hotel
    PriceRange price;

    //Contains a URL pointing to a small image of the hotel
    String thumbnail;

    //Contains an array of URLs pointing to a larger photos of the hotel
    String[] photos;

    //Contains an associative array, mapping each amenity
    Amenities amenities;

    //Contains the amount of stars this hotel has been awarded.
    int stars;

    //Contains an associative array
    Rules rules;

    //contains the available rooms
    Room[] rooms;


    public String getChain_code() {
        return chain_code;
    }

    public void setChain_code(String chain_code) {
        this.chain_code = chain_code;
    }

    public String getChain_name() {
        return chain_name;
    }

    public void setChain_name(String chain_name) {
        this.chain_name = chain_name;
    }

    public String getHotel_code() {
        return hotel_code;
    }

    public void setHotel_code(String hotel_code) {
        this.hotel_code = hotel_code;
    }

    public String getHotel_name() {
        return hotel_name;
    }

    public void setHotel_name(String hotel_name) {
        this.hotel_name = hotel_name;
    }

    public HotelLocation getLocation() {
        return location;
    }

    public void setLocation(HotelLocation location) {
        this.location = location;
    }

    public POI[] getPoints_of_interest() {
        return points_of_interest;
    }

    public void setPoints_of_interest(POI[] points_of_interest) {
        this.points_of_interest = points_of_interest;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public HotelContactInfo getContact_info() {
        return contact_info;
    }

    public void setContact_info(HotelContactInfo contact_info) {
        this.contact_info = contact_info;
    }

    public PriceRange getPrice() {
        return price;
    }

    public void setPrice(PriceRange price) {
        this.price = price;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public String[] getPhotos() {
        return photos;
    }

    public void setPhotos(String[] photos) {
        this.photos = photos;
    }

    public Amenities getAmenities() {
        return amenities;
    }

    public void setAmenities(Amenities amenities) {
        this.amenities = amenities;
    }

    public int getStars() {
        return stars;
    }

    public void setStars(int stars) {
        this.stars = stars;
    }

    public Rules getRules() {
        return rules;
    }

    public void setRules(Rules rules) {
        this.rules = rules;
    }

    public Room[] getRooms() {
        return rooms;
    }

    public void setRooms(Room[] rooms) {
        this.rooms = rooms;
    }


    @Override
    public String toString() {
        return "HotelDetails{" +
                "chain_code='" + chain_code + '\'' +
                ", chain_name='" + chain_name + '\'' +
                ", hotel_code='" + hotel_code + '\'' +
                ", hotel_name='" + hotel_name + '\'' +
                ", location=" + location +
                ", points_of_interest=" + Arrays.toString(points_of_interest) +
                ", description='" + description + '\'' +
                ", contact_info=" + contact_info +
                ", price=" + price +
                ", thumbnail='" + thumbnail + '\'' +
                ", photos=" + Arrays.toString(photos) +
                ", amenities=" + amenities +
                ", stars=" + stars +
                ", rules=" + rules +
                ", rooms=" + Arrays.toString(rooms) +
                '}';
    }
}