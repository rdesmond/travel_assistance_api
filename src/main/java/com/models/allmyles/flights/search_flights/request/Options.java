package com.models.allmyles.flights.search_flights.request;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Options {
    String sort;
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