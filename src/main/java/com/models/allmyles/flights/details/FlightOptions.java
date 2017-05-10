package com.models.allmyles.flights.details;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class FlightOptions {
    //whether the option is enabled or not
    Boolean seatSelectionAvailable;

    //whether the option is enabled or not
    Boolean travelfusionPrepayAvailable;


    public Boolean getSeatSelectionAvailable() {
        return seatSelectionAvailable;
    }

    public void setSeatSelectionAvailable(Boolean seatSelectionAvailable) {
        this.seatSelectionAvailable = seatSelectionAvailable;
    }

    public Boolean getTravelfusionPrepayAvailable() {
        return travelfusionPrepayAvailable;
    }

    public void setTravelfusionPrepayAvailable(Boolean travelfusionPrepayAvailable) {
        this.travelfusionPrepayAvailable = travelfusionPrepayAvailable;
    }


    @Override
    public String toString() {
        return "FlightOptions{" +
                "seatSelectionAvailable=" + seatSelectionAvailable +
                ", travelfusionPrepayAvailable=" + travelfusionPrepayAvailable +
                '}';
    }
}