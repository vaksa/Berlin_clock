package com.becomejavasenior;

import java.io.Serializable;

/**
 * @author Orlov Vladislav on 17.11.2015.
 */
public class Options implements Serializable{

    private int id;
    private int timeZone;
    private Currency currency;

    public Options() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTimeZone() {
        return timeZone;
    }

    public void setTimeZone(int timeZone) {
        this.timeZone = timeZone;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }
}
