package com.models.allmyles.flights.search.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.models.allmyles.flights.details.BaggageTier;
import com.models.allmyles.flights.details.Price;

import java.util.Arrays;

/**
 Warning

 The total_fare field here does not include the credit card surcharge just yet, as fetching the exact surcharge for a
 specific flight can require an extra 5-10 second call to the external provider.

 This surcharge is retrieved in the FlightDetails call.


 Warning

 The prices returned in the fields total_fare and ticketing_fee are converted to HUF by default if the provider returns
 them in a different currency. When displaying prices to the user, please refer to price_charged_by_provider for a more
 accurate fare, where the total fare is returned in the currency the airline is charging, or
 total_fare_in_preferred_currencies for prices converted from the original currency. Important: this price might change
 later as it is not yet updated with credit card and other surcharges.
 */

@JsonIgnoreProperties(ignoreUnknown = true)
public class FlightResult {
    //summary of passenger data per type
    Breakdown[] breakdown;

    //currency of all prices in response
    String currency;

    //fee charged for ticketing
    Float ticketing_fee;

    //total fare, including service fee and ticketing fee
    Float total_fare;

    //list of combination objects
    Combination[] combinations;

    //total fare converted to the client’s preferred currencies, including service fee and ticketing fee
    TotalFareInPreferredCurrencies[] total_fare_in_preferred_currencies;

    //ticketing fee converted to the client’s preferred currencies, including service fee and ticketing fee
    TicketingFeeInPreferredCurrencies[] ticketing_fee_in_preferred_currencies;

    //fare and ticketing fee in the currency the airline is charging
    PriceChargedByProvider[] price_charged_by_provider;

    //contains the different options the passenger has for bringing baggages along. May be requested to be included for
    // LCC flights, otherwise not included in the results.
    BaggageTier[] baggageTiers;

    //Only included in LCC results, and only when requested.
    Price speedy_boarding_fee;

    //Only included in LCC results, and only when requested.
    CheckInCharges[] check_in_charges;


    public Breakdown[] getBreakdown() {
        return breakdown;
    }

    public void setBreakdown(Breakdown[] breakdown) {
        this.breakdown = breakdown;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Float getTicketing_fee() {
        return ticketing_fee;
    }

    public void setTicketing_fee(Float ticketing_fee) {
        this.ticketing_fee = ticketing_fee;
    }

    public Float getTotal_fare() {
        return total_fare;
    }

    public void setTotal_fare(Float total_fare) {
        this.total_fare = total_fare;
    }

    public Combination[] getCombinations() {
        return combinations;
    }

    public void setCombinations(Combination[] combinations) {
        this.combinations = combinations;
    }

    public TotalFareInPreferredCurrencies[] getTotal_fare_in_preferred_currencies() {
        return total_fare_in_preferred_currencies;
    }

    public void setTotal_fare_in_preferred_currencies(TotalFareInPreferredCurrencies[] total_fare_in_preferred_currencies) {
        this.total_fare_in_preferred_currencies = total_fare_in_preferred_currencies;
    }

    public TicketingFeeInPreferredCurrencies[] getTicketing_fee_in_preferred_currencies() {
        return ticketing_fee_in_preferred_currencies;
    }

    public void setTicketing_fee_in_preferred_currencies(TicketingFeeInPreferredCurrencies[] ticketing_fee_in_preferred_currencies) {
        this.ticketing_fee_in_preferred_currencies = ticketing_fee_in_preferred_currencies;
    }

    public PriceChargedByProvider[] getPrice_charged_by_provider() {
        return price_charged_by_provider;
    }

    public void setPrice_charged_by_provider(PriceChargedByProvider[] price_charged_by_provider) {
        this.price_charged_by_provider = price_charged_by_provider;
    }

    public BaggageTier[] getBaggageTiers() {
        return baggageTiers;
    }

    public void setBaggageTiers(BaggageTier[] baggageTiers) {
        this.baggageTiers = baggageTiers;
    }

    public Price getSpeedy_boarding_fee() {
        return speedy_boarding_fee;
    }

    public void setSpeedy_boarding_fee(Price speedy_boarding_fee) {
        this.speedy_boarding_fee = speedy_boarding_fee;
    }

    public CheckInCharges[] getCheck_in_charges() {
        return check_in_charges;
    }

    public void setCheck_in_charges(CheckInCharges[] check_in_charges) {
        this.check_in_charges = check_in_charges;
    }


    @Override
    public String toString() {
        return "FlightResult{" +
                "breakdown=" + Arrays.toString(breakdown) +
                ", currency='" + currency + '\'' +
                ", ticketing_fee=" + ticketing_fee +
                ", total_fare=" + total_fare +
                ", combinations=" + Arrays.toString(combinations) +
                ", total_fare_in_preferred_currencies=" + Arrays.toString(total_fare_in_preferred_currencies) +
                ", ticketing_fee_in_preferred_currencies=" + Arrays.toString(ticketing_fee_in_preferred_currencies) +
                ", price_charged_by_provider=" + Arrays.toString(price_charged_by_provider) +
                ", baggageTiers=" + Arrays.toString(baggageTiers) +
                ", speedy_boarding_fee=" + speedy_boarding_fee +
                ", check_in_charges=" + Arrays.toString(check_in_charges) +
                '}';
    }
}