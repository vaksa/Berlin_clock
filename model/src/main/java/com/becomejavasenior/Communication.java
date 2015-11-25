package com.becomejavasenior;

import java.io.Serializable;

/**
 * @author Orlov Vladislav on 16.11.2015.
 */
public class Communication implements Serializable{

    private int id;
    private Communicable owner;
    private CommunicationForm form;
    private String value;

    public Communication() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Communicable getOwner() {
        return owner;
    }

    public void setOwner(Communicable owner) {
        this.owner = owner;
    }

    public CommunicationForm getType() {
        return form;
    }

    public void setType(CommunicationForm form) {
        this.form = form;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Communication)) return false;

        Communication that = (Communication) o;

        if (getId() != that.getId()) return false;
        if (getOwner() != null ? !getOwner().equals(that.getOwner()) : that.getOwner() != null) return false;
        if (getType() != null ? !getType().equals(that.getType()) : that.getType() != null) return false;
        return !(getValue() != null ? !getValue().equals(that.getValue()) : that.getValue() != null);

    }

    @Override
    public int hashCode() {
        int result = getId();
        result = 31 * result + (getOwner() != null ? getOwner().hashCode() : 0);
        result = 31 * result + (getType() != null ? getType().hashCode() : 0);
        result = 31 * result + (getValue() != null ? getValue().hashCode() : 0);
        return result;
    }
}
