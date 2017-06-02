package com.models.internal;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.ArrayList;
import java.util.List;

/**
 * Internal model for destinations table in database. Use with Trip model.
 * @author cass
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Destination {
    private int id;
    private String name;
    private String country;
    private String sub_region;
    private String iso_country;
    //using instead of matching destination to an airport code in the database - ideally we could make that work so
    // we could search other nearby airports
    private String iata_code;
    //This may not be necessary. The problem is that the database can't hold an array. I'm using the
    // createTripTagList method below to populate this
    private List<TripTag> tags;
    //using until I can figure out how to just use a list of TripTags
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

    public ArrayList<TripTag> createTripTagList() {
        ArrayList<TripTag> tags = new ArrayList<>();
        if (value == 1)
            tags.add(TripTag.value);
        if (beach == 1)
            tags.add(TripTag.beach);
        if (culture == 1)
            tags.add(TripTag.culture);
        if (food == 1)
            tags.add(TripTag.food);
        if (luxury == 1)
            tags.add(TripTag.luxury);
        if (mountain == 1)
            tags.add(TripTag.mountain);
        if (tropical == 1)
            tags.add(TripTag.tropical);
        if (desert == 1)
            tags.add(TripTag.desert);
        if (adventure == 1)
            tags.add(TripTag.adventure);
        if (romance == 1)
            tags.add(TripTag.romance);
        if (relaxation == 1)
            tags.add(TripTag.relaxation);
        if (nature == 1)
            tags.add(TripTag.nature);
        if (sports == 1)
            tags.add(TripTag.sports);
        return tags;
    }

    // Constructors
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
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }

    public String getSub_region() {
        return sub_region;
    }

    public String getIso_country() {
        return iso_country;
    }

    public List<TripTag> getTags() {
        return tags;
    }

    public int getValue() {
        return value;
    }

    public int getBeach() {
        return beach;
    }

    public int getCulture() {
        return culture;
    }

    public int getFood() {
        return food;
    }

    public int getLuxury() {
        return luxury;
    }

    public int getMountain() {
        return mountain;
    }

    public int getTropical() {
        return tropical;
    }

    public int getDesert() {
        return desert;
    }

    public int getAdventure() {
        return adventure;
    }

    public int getRomance() {
        return romance;
    }

    public int getRelaxation() {
        return relaxation;
    }

    public int getNature() {
        return nature;
    }

    public int getSports() {
        return sports;
    }

    public String getIata_code() {
        return iata_code;
    }

    @Override
    public String toString() {
        return "Destination{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", country='" + country + '\'' +
                ", iso_region='" + sub_region + '\'' +
                ", iso_country='" + iso_country + '\'' +
                '}';
    }
}
