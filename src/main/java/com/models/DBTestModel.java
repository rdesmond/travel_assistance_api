package com.models;

/**
 * Created by tdavis on 5/8/17.
 */
/*
* example pojo, what database response maps to
*/
public class DBTestModel {

    int id;
    String first_name;
    String last_name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }
}
