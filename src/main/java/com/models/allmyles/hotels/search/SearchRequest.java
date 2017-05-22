package com.models.allmyles.hotels.search;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SearchRequest {
    //city to search for a hotel in, given as its IATA code
    String cityCode;

    //date when the occupants arrive, in ISO format, not including a time code (ex. 2014-12-24)
    String arrivalDate;

    //date when the occupants arrive, in ISO format, not including a time code (ex. 2014-12-26)
    String leaveDate;

    //number of people wanting to book a room
    int occupancy;

    //nationality of the occupant
    String nationality;


    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }

    public String getArrivalDate() {
        return arrivalDate;
    }

    public void setArrivalDate(String arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    public String getLeaveDate() {
        return leaveDate;
    }

    public void setLeaveDate(String leaveDate) {
        this.leaveDate = leaveDate;
    }

    public int getOccupancy() {
        return occupancy;
    }

    public void setOccupancy(int occupancy) {
        this.occupancy = occupancy;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    @Override
    public String toString() {
        return "SearchRequest{" +
                "cityCode='" + cityCode + '\'' +
                ", occupancy='" + occupancy + '\'' +
                ", arrivalDate='" + arrivalDate + '\'' +
                ", leaveDate='" + leaveDate + '\'' +
                ", nationality='" + nationality + '\'' +
                '}';
    }
}