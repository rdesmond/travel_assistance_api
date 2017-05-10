package com.models.allmyles.flights.details;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.Arrays;

@JsonIgnoreProperties(ignoreUnknown = true)
public class FormField {
    //HTML tag type, in this case select
    String tag;

    //value options of the field
    String[] options;

    //attributes of the field
    Attributes[] attributes;


    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String[] getOptions() {
        return options;
    }

    public void setOptions(String[] options) {
        this.options = options;
    }

    public Attributes[] getAttributes() {
        return attributes;
    }

    public void setAttributes(Attributes[] attributes) {
        this.attributes = attributes;
    }


    @Override
    public String toString() {
        return "FormField{" +
                "tag='" + tag + '\'' +
                ", options=" + Arrays.toString(options) +
                ", attributes=" + Arrays.toString(attributes) +
                '}';
    }
}