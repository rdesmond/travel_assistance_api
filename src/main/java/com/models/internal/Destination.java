package com.models.internal;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * Internal model for destinations table in database. Use with Trip model.
 * @author cass
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Destination {
    int id;
    private String name;
    private String iso_region;
    private String iso_country;

    public Destination() {
        //default
    }

    public Destination(String name, String iso_country) {
        this.name = name;
        this.iso_country = iso_country;
    }

    public Destination(String name, String iso_region, String iso_country) {
        this.name = name;
        this.iso_region = iso_region;
        this.iso_country = iso_country;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIso_region() {
        return iso_region;
    }

    public void setIso_region(String iso_region) {
        this.iso_region = iso_region;
    }

    public String getIso_country() {
        return iso_country;
    }

    public void setIso_country(String iso_country) {
        this.iso_country = iso_country;
    }

    @Override
    public String toString() {
        return "Destination{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", iso_region='" + iso_region + '\'' +
                ", iso_country='" + iso_country + '\'' +
                '}';
    }
}
