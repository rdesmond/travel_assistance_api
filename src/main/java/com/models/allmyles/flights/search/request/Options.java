package com.models.allmyles.flights.search.request;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Options {
    //One of total_fare, -total_fare, comfort_score or -comfort_score (Comfort score). Reverse-order sorting is
    // indicated with a - sign (e.g. -total_fare would return the most expensive option first).
    String sort;

    //filtering options
    Filters filters;


    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    public Filters getFilters() {
        return filters;
    }

    public void setFilters(Filters filters) {
        this.filters = filters;
    }


    @Override
    public String toString() {
        return "Options{" +
                "sort='" + sort + '\'' +
                ", filters=" + filters +
                '}';
    }
}