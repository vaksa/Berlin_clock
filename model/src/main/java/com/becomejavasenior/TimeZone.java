package com.becomejavasenior;

/**
 * @author Orlov Vladislav on 19.11.2015.
 */
public class TimeZone {

    private int id;
    private String name;
    private int timeElation;

    public TimeZone() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTimeElation() {
        return timeElation;
    }

    public void setTimeElation(int timeElation) {
        this.timeElation = timeElation;
    }
}
