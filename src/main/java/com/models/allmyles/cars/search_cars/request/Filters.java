package com.models.allmyles.cars.search_cars.request;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by yovaliceroman on 5/8/17.
 */

@JsonIgnoreProperties(ignoreUnknown = true)
public class Filters {

    String[] type;

    public String[] getType() {
        return type;
    }

    public void setType(String[] type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Filters{" +
                "type='" + Arrays.toString(type) +
                '}';
    }
}
