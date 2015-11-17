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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ConnectionHistory)) return false;

        ConnectionHistory that = (ConnectionHistory) o;

        if (getId() != that.getId()) return false;
        if (getDate() != null ? !getDate().equals(that.getDate()) : that.getDate() != null) return false;
        if (getIp() != null ? !getIp().equals(that.getIp()) : that.getIp() != null) return false;
        if (getBrowser() != null ? !getBrowser().equals(that.getBrowser()) : that.getBrowser() != null) return false;
        return !(getUser() != null ? !getUser().equals(that.getUser()) : that.getUser() != null);

    }

    @Override
    public int hashCode() {
        int result = getId();
        result = 31 * result + (getDate() != null ? getDate().hashCode() : 0);
        result = 31 * result + (getIp() != null ? getIp().hashCode() : 0);
        result = 31 * result + (getBrowser() != null ? getBrowser().hashCode() : 0);
        result = 31 * result + (getUser() != null ? getUser().hashCode() : 0);
        return result;
    }
}
