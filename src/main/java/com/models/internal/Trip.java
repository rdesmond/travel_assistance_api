package com.models.internal;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.Date;
import java.util.List;

/**
 * pojo for trips saved by users
 * @author cass
 */

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Trip {

    private int id;
    private int user_id;
    private Date start_date;
    private Date end_date;
    private int num_travellers;
    private List<Object> destinations;
    private List<Object> flights;
    private List<Object> hotels;
    private List<Object> cars;


    //Constructors
    public Trip() {
        //default
    }
    public Trip(int user_id, Date start_date, Date end_date, int num_travellers) {
        this.user_id = user_id;
        this.start_date = start_date;
        this.end_date = end_date;
        this.num_travellers = num_travellers;
    }
    public Trip(int user_id) {
        this.user_id = user_id;
    }
    public Trip(int user_id, Date start_date, Date end_date, int num_travellers, List<Object> destinations,
                List<Object> flights, List<Object> hotels, List<Object> cars) {
        this.user_id = user_id;
        this.start_date = start_date;
        this.end_date = end_date;
        this.num_travellers = num_travellers;
        this.destinations = destinations;
        this.flights = flights;
        this.hotels = hotels;
        this.cars = cars;
    }

    //Getters and Setters
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public Date getStart_date() {
        return start_date;
    }

    public void setStart_date(Date start_date) {
        this.start_date = start_date;
    }

    public Date getEnd_date() {
        return end_date;
    }

    public void setEnd_date(Date end_date) {
        this.end_date = end_date;
    }

    public int getNum_travellers() {
        return num_travellers;
    }

    public void setNum_travellers(int num_travellers) {
        this.num_travellers = num_travellers;
    }

    public List<Object> getDestinations() {
        return destinations;
    }

    public void setDestinations(List<Object> destinations) {
        this.destinations = destinations;
    }

    public List<Object> getFlights() {
        return flights;
    }

    public void setFlights(List<Object> flights) {
        this.flights = flights;
    }

    public List<Object> getHotels() {
        return hotels;
    }

    public void setHotels(List<Object> hotels) {
        this.hotels = hotels;
    }

    public List<Object> getCars() {
        return cars;
    }

    public void setCars(List<Object> cars) {
        this.cars = cars;
    }
}
