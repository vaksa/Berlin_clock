package com.becomejavasenior;

import java.io.Serializable;
import java.util.GregorianCalendar;

/**
 * @author Orlov Vladislav on 17.11.2015.
 */
public class ConnectionHistory implements Serializable {

    private int id;
    private GregorianCalendar date;
    private String ip;
    private String browser;
    private User user;

    public ConnectionHistory() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public GregorianCalendar getDate() {
        return date;
    }

    public void setDate(GregorianCalendar date) {
        this.date = date;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getBrowser() {
        return browser;
    }

    public void setBrowser(String browser) {
        this.browser = browser;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
