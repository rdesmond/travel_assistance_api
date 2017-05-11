package com.models.allmyles.hotels.room_details;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Rules {
    String cancellation;
    String notes;
    boolean needs_guarantee;
    boolean needs_deposit;


    public String getCancellation() {
        return cancellation;
    }

    public void setCancellation(String cancellation) {
        this.cancellation = cancellation;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public boolean isNeeds_guarantee() {
        return needs_guarantee;
    }

    public void setNeeds_guarantee(boolean needs_guarantee) {
        this.needs_guarantee = needs_guarantee;
    }

    public boolean isNeeds_deposit() {
        return needs_deposit;
    }

    public void setNeeds_deposit(boolean needs_deposit) {
        this.needs_deposit = needs_deposit;
    }


    @Override
    public String toString() {
        return "Rules{" +
                "cancellation='" + cancellation + '\'' +
                ", notes='" + notes + '\'' +
                ", needs_guarantee=" + needs_guarantee +
                ", needs_deposit=" + needs_deposit +
                '}';
    }
}