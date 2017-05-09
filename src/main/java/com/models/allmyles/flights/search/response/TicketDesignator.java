package com.models.allmyles.flights.search.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

//Ticket designators are the mini-rules for the flight, with entries such as
// {"code": "70|PEN", "extension": "TICKETS ARE NON-REFUNDABLE|"}.

@JsonIgnoreProperties(ignoreUnknown = true)
public class TicketDesignator {
    //ticket designator’s code
    String code;

    //ticket designator’s description
    String extension;


    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }


    @Override
    public String toString() {
        return "TicketDesignator{" +
                "code='" + code + '\'' +
                ", extension='" + extension + '\'' +
                '}';
    }
}
