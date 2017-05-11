package com.models.allmyles.flights.search.request;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)

//You send the two requests in separate sessions - in this case you have to include Flexible Date search Reference in
// the regular search request, and set to_be_referenced to True in the flexible date search request.
public class FlexibleDateSearchReference {
    //the Cookie sent in the header of the referenced flexible date search
    String cookie;

    //number of days submitted in extraDays in the referenced flexible date search
    byte extra_days;


    public String getCookie() {
        return cookie;
    }

    public void setCookie(String cookie) {
        this.cookie = cookie;
    }

    public byte getExtra_days() {
        return extra_days;
    }

    public void setExtra_days(byte extra_days) {
        this.extra_days = extra_days;
    }


    @Override
    public String toString() {
        return "FlexibleDateSearchReference{" +
                "cookie='" + cookie + '\'' +
                ", extra_days=" + extra_days +
                '}';
    }
}