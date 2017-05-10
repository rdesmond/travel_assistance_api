package com.models.allmyles.cars.get_car_details.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.models.allmyles.cars.search_cars.response.Price;

/**
 * Created by yovaliceroman on 5/9/17.
 */

@JsonIgnoreProperties(ignoreUnknown = true)
public class Package {

    Price price;
    String type;
    String period;
    String description;

    public Price getPrice() {
        return price;
    }

    public void setPrice(Price price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Package{" +
                "price='" + price + '\'' +
                "type='" + type + '\'' +
                "period='" + period + '\'' +
                "description='" + description +
                '}';
    }
}
