package com.models.internal;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.models.TripTag;

import java.math.BigDecimal;
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
    private BigDecimal budget;
    private List<Destination> destinations;
    private List<TripFlight> flights;
    private List<TripHotel> hotels;
    private List<TripCar> cars;
    //private List<TripTag> tags;
    // Not sure yet if I need these
    private int trip_destination_id;
    private int trip_flight_id;
    private int trip_hotel_id;
    private int trip_car_id;
    //using until I can figure out how to just use enum list
    private int value =0;
    private int beach =0;
    private int culture =0;
    private int food =0;
    private int luxury =0;
    private int mountain =0;
    private int tropical =0;
    private int desert =0;
    private int adventure =0;
    private int romance =0;
    private int relaxation =0;
    private int nature =0;
    private int sports =0;

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
    public Trip(int user_id, Date start_date, Date end_date, int num_travellers, List<Destination> destinations,
                List<TripFlight> flights, List<TripHotel> hotels, List<TripCar> cars) {
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

    public List<Destination> getDestinations() {
        return destinations;
    }

    public void setDestinations(List<Destination> destinations) {
        this.destinations = destinations;
    }

    public List<TripFlight> getFlights() {
        return flights;
    }

    public void setFlights(List<TripFlight> flights) {
        this.flights = flights;
    }

    public List<TripHotel> getHotels() {
        return hotels;
    }

    public void setHotels(List<TripHotel> hotels) {
        this.hotels = hotels;
    }

    public List<TripCar> getCars() {
        return cars;
    }

    public void setCars(List<TripCar> cars) {
        this.cars = cars;
    }

    public BigDecimal getBudget() {
        return budget;
    }

    public void setBudget(BigDecimal budget) {
        this.budget = budget;
    }

//    public List<TripTag> getTags() {
//        return tags;
//    }
//
//    public void setTags(List<TripTag> tags) {
//        this.tags = tags;
//    }
}
