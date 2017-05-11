package com.models.allmyles.flights.details;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 Field Names
 -------------------------------------------------

 Passenger:

 namePrefix
 firstName
 middleName
 lastName
 gender
 birthDate
 document/type
 document/id
 document/issueCountry
 document/dateOfExpiry


 Contact and Billing Info:

 name
 email
 address/addressLine1
 address/addressLine2
 address/addressLine3
 address/cityName
 address/zipCode
 address/countryCode
 phone/countryCode
 phone/areaCode
 phone/phoneNumber
 */

@JsonIgnoreProperties(ignoreUnknown = true)
public class Attributes {
    //one of Field Names
    String name;

    //user friendly field label
    @JsonProperty("data-label")
    String datalabel;

    //type of input data (†ext or email)
    String type;


    Float maxLength;

    //if present, field is required
    String required;

    //regex pattern of valid data
    String pattern;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDatalabel() {
        return datalabel;
    }

    public void setDatalabel(String datalabel) {
        this.datalabel = datalabel;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Float getMaxLength() {
        return maxLength;
    }

    public void setMaxLength(Float maxLength) {
        this.maxLength = maxLength;
    }

    public String getRequired() {
        return required;
    }

    public void setRequired(String required) {
        this.required = required;
    }

    public String getPattern() {
        return pattern;
    }

    public void setPattern(String pattern) {
        this.pattern = pattern;
    }


    @Override
    public String toString() {
        return "Attributes{" +
                "name='" + name + '\'' +
                ", datalabel='" + datalabel + '\'' +
                ", type='" + type + '\'' +
                ", maxLength=" + maxLength +
                ", required='" + required + '\'' +
                ", pattern='" + pattern + '\'' +
                '}';
    }
}