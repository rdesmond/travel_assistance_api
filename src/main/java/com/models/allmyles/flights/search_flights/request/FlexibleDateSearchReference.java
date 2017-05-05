package com.models.allmyles.flights.search_flights.request;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class FlexibleDateSearchReference {
    String cookie;
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