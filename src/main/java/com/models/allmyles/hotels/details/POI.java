package com.models.allmyles.hotels.details;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.Arrays;

@JsonIgnoreProperties(ignoreUnknown = true)
public class POI {
    Airports[] airports;
    CityCenter city_center;
    Miscellaneous[] miscellaneous;


    public Airports[] getAirports() {
        return airports;
    }

    public void setAirports(Airports[] airports) {
        this.airports = airports;
    }

    public CityCenter getCityCenter() {
        return city_center;
    }

    public void setCityCenter(CityCenter cityCenter) {
        this.city_center = cityCenter;
    }

    public Miscellaneous[] getMiscellaneous() {
        return miscellaneous;
    }

    public void setMiscellaneous(Miscellaneous[] miscellaneous) {
        this.miscellaneous = miscellaneous;
    }


    @Override
    public String toString() {
        return "POI{" +
                "airports=" + Arrays.toString(airports) +
                ", cityCenter=" + city_center +
                ", miscellaneous=" + Arrays.toString(miscellaneous) +
                '}';
    }
}