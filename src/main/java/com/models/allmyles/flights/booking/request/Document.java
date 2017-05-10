package com.models.allmyles.flights.booking.request;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Document {
    //document’s ID number
    String id;

    //format is YYYY-MM-DD
    String dateOfExpiry;

    //two letter code of issuing country
    String issueCountry;

    //one of DocumentTypes
    String type;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDateOfExpiry() {
        return dateOfExpiry;
    }

    public void setDateOfExpiry(String dateOfExpiry) {
        this.dateOfExpiry = dateOfExpiry;
    }

    public String getIssueCountry() {
        return issueCountry;
    }

    public void setIssueCountry(String issueCountry) {
        this.issueCountry = issueCountry;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }


    @Override
    public String toString() {
        return "Document{" +
                "id='" + id + '\'' +
                ", dateOfExpiry='" + dateOfExpiry + '\'' +
                ", issueCountry='" + issueCountry + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}