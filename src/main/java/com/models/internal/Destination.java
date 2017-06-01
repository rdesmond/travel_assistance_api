package com.models.internal;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.models.TripTag;

import java.util.List;

/**
 * Internal model for destinations table in database. Use with Trip model.
 * @author cass
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Destination {
    int id;
    private String name;
    private String country;
    private String sub_region;
    private String iso_country;
    private int population;
    //private List<TripTag> tags;
    //using until I can figure out how to just use enum list
    private int value =0;
    private int beach =0;
    private int culture =0;
    private int food =0;
    private int luxury =0;
    private int mountain =0;
    private int tropical =0;
    private int desert =0;
    private int adventure =0;
    private int romance =0;
    private int relaxation =0;
    private int nature =0;
    private int sports =0;
    //using instead of matching destination to an airport code in the database - ideally we could make that work so
    // we could search other nearby airports
    private String iata_code;

    public Destination() {
        //default
    }

    public Destination(String name, String country) {
        this.name = name;
        this.iso_country = country;
    }

    public Destination(String name, String iso_region, String iso_country) {
        this.name = name;
        this.sub_region = iso_region;
        this.iso_country = iso_country;
    }

    public Destination(String name, String country, String iso_region, String iso_country, int population) {
        this.name = name;
        this.country = country;
        this.sub_region = iso_region;
        this.iso_country = iso_country;
        this.population = population;
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
        return sub_region;
    }

    public void setIso_region(String iso_region) {
        this.sub_region = iso_region;
    }

    public String getIso_country() {
        return iso_country;
    }

    public void setIso_country(String iso_country) {
        this.iso_country = iso_country;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }



    @Override
    public String toString() {
        return "Destination{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", country='" + country + '\'' +
                ", iso_region='" + sub_region + '\'' +
                ", iso_country='" + iso_country + '\'' +
                ", population=" + population +
                '}';
    }
}
