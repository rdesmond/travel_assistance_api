package com.models.allmyles.flights.search.request;

import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

//POST /flights

@JsonIgnoreProperties(ignoreUnknown = true)
public class SearchFlights {
    //root container
    //departure location, given as IATA code
    String fromLocation;

    //destination, given as IATA code
    String toLocation;

    //(optional) destination airport, given as IATA code, must be in the city specified in toLocation
    String toAirport;

    // (optional) departure airport, given as IATA code, must be in the city specified in fromLocation
    String fromAirport;

    //date of departure, in ISO format, including a time code, even though whole day will be searched by default
    String departureDate;

    //(optional) date of return, in ISO format, including a time code, even though whole day will be searched by default
    String returnDate;

    //a list of passengers, grouped by type code, containing Persons
    Person[] persons;

    // information about the end user
    UserData userData;

    //(optional) type of results to retrieve
    String providerType;

    //(optional) list of airlines to filter results to, given as their two character IATA code
    String[] preferredAirlines;

    //(optional) number of days to call Flexible Date search with, between 1-3
    byte extraDays;

    //(optional) sorting and filtering options
    Options options;

    //data about the flexible date search made with the same parameters as the regular one
    FlexibleDateSearchReference flexible_date_search_reference;

    // (optional) True if this is a flexible date search and a regular search is to be called next with
    // flexible_date_search_reference
    boolean to_be_referenced;

    //(optional) The number of bags to be bundled with the price of LCC flights. This option has no effect for searches
    // with the default provider, please contact Allmyles for details on alternative providers.
    byte number_of_bags;

    // (optional) Whether or not you would like to receive the baggage price tiers in the search step of LCC flights.
    // Baggage price tiers are always sent in the details step, only request this data if you are using it on search.
    // This option has no effect for searches with the default provider, please contact Allmyles for details on
    // alternative providers.
    boolean baggage_charges;

    //(optional) Whether or not you would like to receive the check in price tiers in the search step of LCC flights.
    // This option has no effect for searches with the default provider, please contact Allmyles for details on
    // alternative providers.
    boolean check_in_charges;

    //(optional) Whether or not you would like to receive the speedy boarding fee information in the search step of LCC
    // flights. This option has no effect for searches with the default provider, please contact Allmyles for details on
    // alternative providers.
    boolean speedy_boarding_charges;


    public String getFromLocation() {
        return fromLocation;
    }

    public void setFromLocation(String fromLocation) {
        this.fromLocation = fromLocation;
    }

    public String getToLocation() {
        return toLocation;
    }

    public void setToLocation(String toLocation) {
        this.toLocation = toLocation;
    }

    public String getToAirport() {
        return toAirport;
    }

    public void setToAirport(String toAirport) {
        this.toAirport = toAirport;
    }

    public String getFromAirport() {
        return fromAirport;
    }

    public void setFromAirport(String fromAirport) {
        this.fromAirport = fromAirport;
    }

    public String getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(String departureDate) {
        this.departureDate = departureDate;
    }

    public String getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(String returnDate) {
        this.returnDate = returnDate;
    }

    public Person[] getPersons() {
        return persons;
    }

    public void setPersons(Person[] persons) {
        this.persons = persons;
    }

    public UserData getUserData() {
        return userData;
    }

    public void setUserData(UserData userData) {
        this.userData = userData;
    }

    public String getProviderType() {
        return providerType;
    }

    public void setProviderType(String providerType) {
        this.providerType = providerType;
    }

    public String[] getPreferredAirlines() {
        return preferredAirlines;
    }

    public void setPreferredAirlines(String[] preferredAirlines) {
        this.preferredAirlines = preferredAirlines;
    }

    public byte getExtraDays() {
        return extraDays;
    }

    public void setExtraDays(byte extraDays) {
        this.extraDays = extraDays;
    }

    public Options getOptions() {
        return options;
    }

    public void setOptions(Options options) {
        this.options = options;
    }

    public FlexibleDateSearchReference getFlexible_date_search_reference() {
        return flexible_date_search_reference;
    }

    public void setFlexible_date_search_reference(FlexibleDateSearchReference flexible_date_search_reference) {
        this.flexible_date_search_reference = flexible_date_search_reference;
    }

    public boolean isTo_be_referenced() {
        return to_be_referenced;
    }

    public void setTo_be_referenced(boolean to_be_referenced) {
        this.to_be_referenced = to_be_referenced;
    }

    public byte getNumber_of_bags() {
        return number_of_bags;
    }

    public void setNumber_of_bags(byte number_of_bags) {
        this.number_of_bags = number_of_bags;
    }

    public boolean isBaggage_charges() {
        return baggage_charges;
    }

    public void setBaggage_charges(boolean baggage_charges) {
        this.baggage_charges = baggage_charges;
    }

    public boolean isCheck_in_charges() {
        return check_in_charges;
    }

    public void setCheck_in_charges(boolean check_in_charges) {
        this.check_in_charges = check_in_charges;
    }

    public boolean isSpeedy_boarding_charges() {
        return speedy_boarding_charges;
    }

    public void setSpeedy_boarding_charges(boolean speedy_boarding_charges) {
        this.speedy_boarding_charges = speedy_boarding_charges;
    }


    @Override
    public String toString() {
        return "SearchFlights{" +
                "fromLocation='" + fromLocation + '\'' +
                ", toLocation='" + toLocation + '\'' +
                ", toAirport='" + toAirport + '\'' +
                ", fromAirport='" + fromAirport + '\'' +
                ", departureDate='" + departureDate + '\'' +
                ", returnDate='" + returnDate + '\'' +
                ", persons=" + Arrays.toString(persons) +
                ", userData=" + userData +
                ", providerType='" + providerType + '\'' +
                ", preferredAirlines=" + Arrays.toString(preferredAirlines) +
                ", extraDays=" + extraDays +
                ", options=" + options +
                ", flexible_date_search_reference=" + flexible_date_search_reference +
                ", to_be_referenced=" + to_be_referenced +
                ", number_of_bags=" + number_of_bags +
                ", baggage_charges=" + baggage_charges +
                ", check_in_charges=" + check_in_charges +
                ", speedy_boarding_charges=" + speedy_boarding_charges +
                '}';
    }
}