package com.models.allmyles.cars.search_cars.request;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by yovaliceroman on 5/8/17.
 */

@JsonIgnoreProperties(ignoreUnknown = true)
public class SearchCars {

    String airport_code;
    String start_date;
    String end_date;
    Filters filters;

    public SearchCars() {}

    public SearchCars(String airport_code, String start_date, String end_date) {
        this.airport_code = airport_code;
        this.start_date = start_date;
        this.end_date = end_date;
    }

    public SearchCars(String airport_code, String start_date, String end_date, Filters filters) {
        this.airport_code = airport_code;
        this.start_date = start_date;
        this.end_date = end_date;
        this.filters = filters;
    }

    public String getAirport_code() {
        return airport_code;
    }

    public void setAirport_code(String airport_code) {
        this.airport_code = airport_code;
    }

    public String getStart_date() {
        return start_date;
    }

    public void setStart_date(String start_date) {
        this.start_date = start_date;
    }

    public String getEnd_date() {
        return end_date;
    }

    public void setEnd_date(String end_date) {
        this.end_date = end_date;
    }

    public Filters getFilter() {
        return filters;
    }

    public void setFilter(Filters filters) {
        this.filters = filters;
    }

    @Override
    public String toString() {
        return "SearchCars{" +
                "airport_code='" + airport_code + '\'' +
                ", start_date='" + start_date + '\'' +
                ", end_date='" + end_date + '\'' +
                ", filters='" + filters +
                '}';
    }
}
