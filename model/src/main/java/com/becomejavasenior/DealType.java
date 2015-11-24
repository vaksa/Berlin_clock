package com.becomejavasenior;

import java.io.Serializable;

/**
 * @author Orlov Vladislav on 17.11.2015.
 */
public class DealType implements Serializable {

    private int id;
    private String name;

    public DealType() {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof DealType)) return false;

        DealType dealType = (DealType) o;

        if (getId() != dealType.getId()) return false;
        return !(getName() != null ? !getName().equals(dealType.getName()) : dealType.getName() != null);

    }

    @Override
    public int hashCode() {
        int result = getId();
        result = 31 * result + (getName() != null ? getName().hashCode() : 0);
        return result;
    }
}
