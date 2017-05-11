package com.models.allmyles.flights.details;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.models.allmyles.flights.search.response.FlightResult;

import java.util.Arrays;

/**
 Warning

 While the price field contains the ticket’s final price, baggages are not included in that, as the user may be able to
 choose from different baggage tiers. It is the travel site’s responsibility to add the cost of the passenger’s baggages
 themselves as an extra cost.

 Note

 Providers return prices in the travel site’s preferred currency automatically. In the rare case that they might fail
 to do so, the Allmyles API will convert the prices to the flight fare’s currency automatically, based on the provider’s
 currency conversion data.
 */

@JsonIgnoreProperties(ignoreUnknown = true)
public class FlightDetails {
    //link to the airline’s rules page (hosted on the airline’s website)
    String rulesLink;

    //contains the different options the passenger has for bringing baggages along. The book request will need to
    // contain the ID of one of these objects in the baggage field.
    BaggageTier[] baggageTiers;

    //contains the different options of cabin baggages. The book request will need to contain the ID of one of these
    // objects in the carry-on baggage field.
    CarryOnBaggageTier carryOnBaggageTiers;

    //contains field validation data
    FormFields fields;

    //contains the final price of the ticket (including the credit card surcharge, but not the baggages)
    Price price;

    //contains an exact copy of the result from the search call’s response
    FlightResult result;

    //contains whether certain options are enabled for this flight
    FlightOptions options;

    //contains the credit card surcharge for this flight
    Price surcharge;

    //contains the final price of the ticket converted to the client’s preferred currencies
    Price[] price_in_preferred_currencies;

    //contains the credit card surcharge for this flight converted to the client’s preferred currencies
    Price[] surcharge_in_preferred_currencies;


    public String getRulesLink() {
        return rulesLink;
    }

    public void setRulesLink(String rulesLink) {
        this.rulesLink = rulesLink;
    }

    public BaggageTier[] getBaggageTiers() {
        return baggageTiers;
    }

    public void setBaggageTiers(BaggageTier[] baggageTiers) {
        this.baggageTiers = baggageTiers;
    }

    public CarryOnBaggageTier getCarryOnBaggageTiers() {
        return carryOnBaggageTiers;
    }

    public void setCarryOnBaggageTiers(CarryOnBaggageTier carryOnBaggageTiers) {
        this.carryOnBaggageTiers = carryOnBaggageTiers;
    }

    public FormFields getFields() {
        return fields;
    }

    public void setFields(FormFields fields) {
        this.fields = fields;
    }

    public Price getPrice() {
        return price;
    }

    public void setPrice(Price price) {
        this.price = price;
    }

    public FlightResult getResult() {
        return result;
    }

    public void setResult(FlightResult result) {
        this.result = result;
    }

    public FlightOptions getOptions() {
        return options;
    }

    public void setOptions(FlightOptions options) {
        this.options = options;
    }

    public Price getSurcharge() {
        return surcharge;
    }

    public void setSurcharge(Price surcharge) {
        this.surcharge = surcharge;
    }

    public Price[] getPrice_in_preferred_currencies() {
        return price_in_preferred_currencies;
    }

    public void setPrice_in_preferred_currencies(Price[] price_in_preferred_currencies) {
        this.price_in_preferred_currencies = price_in_preferred_currencies;
    }

    public Price[] getSurcharge_in_preferred_currencies() {
        return surcharge_in_preferred_currencies;
    }

    public void setSurcharge_in_preferred_currencies(Price[] surcharge_in_preferred_currencies) {
        this.surcharge_in_preferred_currencies = surcharge_in_preferred_currencies;
    }


    @Override
    public String toString() {
        return "FlightDetails{" +
                "rulesLink='" + rulesLink + '\'' +
                ", baggageTiers=" + Arrays.toString(baggageTiers) +
                ", carryOnBaggageTiers=" + carryOnBaggageTiers +
                ", fields=" + fields +
                ", price=" + price +
                ", result=" + result +
                ", options=" + options +
                ", surcharge=" + surcharge +
                ", price_in_preferred_currencies=" + Arrays.toString(price_in_preferred_currencies) +
                ", surcharge_in_preferred_currencies=" + Arrays.toString(surcharge_in_preferred_currencies) +
                '}';
    }
}