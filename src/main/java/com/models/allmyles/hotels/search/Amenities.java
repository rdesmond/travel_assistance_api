package com.models.allmyles.hotels.search;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Amenities {
    boolean restaurant;
    boolean bar;
    boolean laundry;
    boolean room_service;
    boolean safe_deposit_box;
    boolean parking;
    boolean swimming;
    boolean internet;
    boolean gym;
    boolean air_conditioning;
    boolean business_center;
    boolean meeting_rooms;
    boolean spa;
    boolean pets_allowed;


    public boolean isRestaurant() {
        return restaurant;
    }

    public void setRestaurant(boolean restaurant) {
        this.restaurant = restaurant;
    }

    public boolean isBar() {
        return bar;
    }

    public void setBar(boolean bar) {
        this.bar = bar;
    }

    public boolean isLaundry() {
        return laundry;
    }

    public void setLaundry(boolean laundry) {
        this.laundry = laundry;
    }

    public boolean isRoom_service() {
        return room_service;
    }

    public void setRoom_service(boolean room_service) {
        this.room_service = room_service;
    }

    public boolean isSafe_deposit_box() {
        return safe_deposit_box;
    }

    public void setSafe_deposit_box(boolean safe_deposit_box) {
        this.safe_deposit_box = safe_deposit_box;
    }

    public boolean isParking() {
        return parking;
    }

    public void setParking(boolean parking) {
        this.parking = parking;
    }

    public boolean isSwimming() {
        return swimming;
    }

    public void setSwimming(boolean swimming) {
        this.swimming = swimming;
    }

    public boolean isInternet() {
        return internet;
    }

    public void setInternet(boolean internet) {
        this.internet = internet;
    }

    public boolean isGym() {
        return gym;
    }

    public void setGym(boolean gym) {
        this.gym = gym;
    }

    public boolean isAir_conditioning() {
        return air_conditioning;
    }

    public void setAir_conditioning(boolean air_conditioning) {
        this.air_conditioning = air_conditioning;
    }

    public boolean isBusiness_center() {
        return business_center;
    }

    public void setBusiness_center(boolean business_center) {
        this.business_center = business_center;
    }

    public boolean isMeeting_rooms() {
        return meeting_rooms;
    }

    public void setMeeting_rooms(boolean meeting_rooms) {
        this.meeting_rooms = meeting_rooms;
    }

    public boolean isSpa() {
        return spa;
    }

    public void setSpa(boolean spa) {
        this.spa = spa;
    }

    public boolean isPets_allowed() {
        return pets_allowed;
    }

    public void setPets_allowed(boolean pets_allowed) {
        this.pets_allowed = pets_allowed;
    }


    @Override
    public String toString() {
        return "Amenities{" +
                "air_conditioning=" + air_conditioning +
                ", bar=" + bar +
                ", business_center=" + business_center +
                ", gym=" + gym +
                ", internet=" + internet +
                ", laundry=" + laundry +
                ", meeting_rooms=" + meeting_rooms +
                ", parking=" + parking +
                ", restaurant=" + restaurant +
                ", room_service=" + room_service +
                ", safe_deposit_box=" + safe_deposit_box +
                ", spa=" + spa +
                ", swimming=" + swimming +
                ", pets_allowed=" + pets_allowed +
                '}';
    }
}