package com.models.allmyles.flights.search_flights.request;

import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SearchFlights {
    String fromLocation;
    String toLocation;
    String toAirport;
    String fromAirport;
    String departureDate;
    String returnDate;
    Persons[] persons;
    UserData userData;
    String providerType;
    String[] preferredAirlines;
    byte extraDays;
    Options options;
    FlexibleDateSearchReference flexible_date_search_reference;
    boolean to_be_referenced;
    byte number_of_bags;
    boolean baggage_charges;
    boolean check_in_charges;
    boolean speedy_boarding_charges;
    String tenantReferenceId;
    short fromRadius;
    short toRadius;

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

    public Persons[] getPersons() {
        return persons;
    }

    public void setPersons(Persons[] persons) {
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

    public String getTenantReferenceId() {
        return tenantReferenceId;
    }

    public void setTenantReferenceId(String tenantReferenceId) {
        this.tenantReferenceId = tenantReferenceId;
    }

    public short getFromRadius() {
        return fromRadius;
    }

    public void setFromRadius(short fromRadius) {
        this.fromRadius = fromRadius;
    }

    public short getToRadius() {
        return toRadius;
    }

    public void setToRadius(short toRadius) {
        this.toRadius = toRadius;
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
                ", tenantReferenceId='" + tenantReferenceId + '\'' +
                ", fromRadius=" + fromRadius +
                ", toRadius=" + toRadius +
                '}';
    }
}