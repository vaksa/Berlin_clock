package com.becomejavasenior;

import java.io.Serializable;

/**
 * @author Orlov Vladislav on 17.11.2015.
 */
public class Currency implements Serializable {

    private int id;
    private String code;
    private String name;

    public Currency() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Currency)) return false;

        Currency currency = (Currency) o;

        if (getId() != currency.getId()) return false;
        if (!getCode().equals(currency.getCode())) return false;
        return getName().equals(currency.getName());

    }

    @Override
    public int hashCode() {
        int result = getId();
        result = 31 * result + getCode().hashCode();
        result = 31 * result + getName().hashCode();
        return result;
    }
}
