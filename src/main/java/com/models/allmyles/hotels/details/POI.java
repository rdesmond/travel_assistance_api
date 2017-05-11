package com.models.allmyles.hotels.details;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.Arrays;

@JsonIgnoreProperties(ignoreUnknown = true)
public class POI {
    Airports[] airports;
    CityCenter cityCenter;
    Miscellaneous[] miscellaneous;


    public Airports[] getAirports() {
        return airports;
    }

    public void setAirports(Airports[] airports) {
        this.airports = airports;
    }

    public CityCenter getCityCenter() {
        return cityCenter;
    }

    public void setCityCenter(CityCenter cityCenter) {
        this.cityCenter = cityCenter;
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
                ", cityCenter=" + cityCenter +
                ", miscellaneous=" + Arrays.toString(miscellaneous) +
                '}';
    }
}