package com.models.allmyles.hotels.details;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Traits {
    boolean bath;

    boolean shower;

    boolean nonsmoking;

    boolean suite;

    //can be one of: ‘minimum’, ‘standard’, ‘moderate’, ‘superior’, ‘executive’
    String category;


    public boolean isBath() {
        return bath;
    }

    public void setBath(boolean bath) {
        this.bath = bath;
    }

    public boolean isShower() {
        return shower;
    }

    public void setShower(boolean shower) {
        this.shower = shower;
    }

    public boolean isNonsmoking() {
        return nonsmoking;
    }

    public void setNonsmoking(boolean nonsmoking) {
        this.nonsmoking = nonsmoking;
    }

    public boolean isSuite() {
        return suite;
    }

    public void setSuite(boolean suite) {
        this.suite = suite;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }


    @Override
    public String toString() {
        return "Traits{" +
                "bath=" + bath +
                ", shower=" + shower +
                ", nonsmoking=" + nonsmoking +
                ", suite=" + suite +
                ", category='" + category + '\'' +
                '}';
    }
}