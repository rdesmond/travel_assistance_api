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
    private String iso_region;
    private String iso_country;
    private int population;
    private List<TripTag> tags;

    public Destination() {
        //default
    }

    public Destination(String name, String country) {
        this.name = name;
        this.iso_country = country;
    }

    public Destination(String name, String iso_region, String iso_country) {
        this.name = name;
        this.iso_region = iso_region;
        this.iso_country = iso_country;
    }

    public Destination(String name, String country, String iso_region, String iso_country, int population) {
        this.name = name;
        this.country = country;
        this.iso_region = iso_region;
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

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public List<TripTag> getTags() {
        return tags;
    }

    public void setTags(List<TripTag> tags) {
        this.tags = tags;
    }

    @Override
    public String toString() {
        return "Destination{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", country='" + country + '\'' +
                ", iso_region='" + iso_region + '\'' +
                ", iso_country='" + iso_country + '\'' +
                ", population=" + population +
                ", tags=" + tags +
                '}';
    }
}
