package com.models.allmyles.flights.rules;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.Arrays;

@JsonIgnoreProperties(ignoreUnknown = true)
public class RulesResultSet {
    //contains the flight rule texts, is returned only for traditional flights
    Rule[] rules;

    //contains a link to the airline’s rules page, is returned only for LCC flights
    String link;


    public Rule[] getRules() {
        return rules;
    }

    public void setRules(Rule[] rules) {
        this.rules = rules;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }


    @Override
    public String toString() {
        return "RulesResultSet{" +
                "rules=" + Arrays.toString(rules) +
                ", link='" + link + '\'' +
                '}';
    }
}