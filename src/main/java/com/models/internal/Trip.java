package com.models.internal;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.math.BigDecimal;
import java.util.ArrayList;
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
    private String sub_region;
    private List<Destination> destinations;
    private List<TripFlight> flights;
    private List<TripHotel> hotels;
    private List<TripCar> cars;
    // Not sure yet if I need these, this would match the database
    private int trip_destination_id;
    private int trip_flight_id;
    private int trip_hotel_id;
    private int trip_car_id;
    //This may not be necessary. The problem is that the database can't hold an array. I'm using the
    // createTripTagList method below to populate this
    private List<TripTag> tags;
    //using until I can figure out how to just use a list of TripTags
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

    public ArrayList<TripTag> createTripTagList() {
        ArrayList<TripTag> tags = new ArrayList<>();
        if (value == 1)
            tags.add(TripTag.value);
        if (beach == 1)
            tags.add(TripTag.beach);
        if (culture == 1)
            tags.add(TripTag.culture);
        if (food == 1)
            tags.add(TripTag.food);
        if (luxury == 1)
            tags.add(TripTag.luxury);
        if (mountain == 1)
            tags.add(TripTag.mountain);
        if (tropical == 1)
            tags.add(TripTag.tropical);
        if (desert == 1)
            tags.add(TripTag.desert);
        if (adventure == 1)
            tags.add(TripTag.adventure);
        if (romance == 1)
            tags.add(TripTag.romance);
        if (relaxation == 1)
            tags.add(TripTag.relaxation);
        if (nature == 1)
            tags.add(TripTag.nature);
        if (sports == 1)
            tags.add(TripTag.sports);
        return tags;
    }

    //Constructors
    public Trip() {
        //default
    }

    public Trip(int user_id, Date start_date, Date end_date, int num_travellers, BigDecimal budget, String sub_region) {
        this.user_id = user_id;
        this.start_date = start_date;
        this.end_date = end_date;
        this.num_travellers = num_travellers;
        this.budget = budget;
        this.sub_region = sub_region;
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

    public String getSub_region() {
        return sub_region;
    }

    public void setSub_region(String sub_region) {
        this.sub_region = sub_region;
    }

    public int getTrip_destination_id() {
        return trip_destination_id;
    }

    public void setTrip_destination_id(int trip_destination_id) {
        this.trip_destination_id = trip_destination_id;
    }

    public int getTrip_flight_id() {
        return trip_flight_id;
    }

    public void setTrip_flight_id(int trip_flight_id) {
        this.trip_flight_id = trip_flight_id;
    }

    public int getTrip_hotel_id() {
        return trip_hotel_id;
    }

    public void setTrip_hotel_id(int trip_hotel_id) {
        this.trip_hotel_id = trip_hotel_id;
    }

    public int getTrip_car_id() {
        return trip_car_id;
    }

    public void setTrip_car_id(int trip_car_id) {
        this.trip_car_id = trip_car_id;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getBeach() {
        return beach;
    }

    public void setBeach(int beach) {
        this.beach = beach;
    }

    public int getCulture() {
        return culture;
    }

    public void setCulture(int culture) {
        this.culture = culture;
    }

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food = food;
    }

    public int getLuxury() {
        return luxury;
    }

    public void setLuxury(int luxury) {
        this.luxury = luxury;
    }

    public int getMountain() {
        return mountain;
    }

    public void setMountain(int mountain) {
        this.mountain = mountain;
    }

    public int getTropical() {
        return tropical;
    }

    public void setTropical(int tropical) {
        this.tropical = tropical;
    }

    public int getDesert() {
        return desert;
    }

    public void setDesert(int desert) {
        this.desert = desert;
    }

    public int getAdventure() {
        return adventure;
    }

    public void setAdventure(int adventure) {
        this.adventure = adventure;
    }

    public int getRomance() {
        return romance;
    }

    public void setRomance(int romance) {
        this.romance = romance;
    }

    public int getRelaxation() {
        return relaxation;
    }

    public void setRelaxation(int relaxation) {
        this.relaxation = relaxation;
    }

    public int getNature() {
        return nature;
    }

    public void setNature(int nature) {
        this.nature = nature;
    }

    public int getSports() {
        return sports;
    }

    public void setSports(int sports) {
        this.sports = sports;
    }
}
