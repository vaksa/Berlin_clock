package com.becomejavasenior;

import java.io.Serializable;

/**
 * @author Orlov Vladislav on 17.11.2015.
 */
public class DealStatus implements Serializable {

    private int id;
    private String name;
    private boolean isFinish;

    public DealStatus() {
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

    public boolean isFinish() {
        return isFinish;
    }

    public void setIsFinish(boolean isFinish) {
        this.isFinish = isFinish;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof DealStatus)) return false;

        DealStatus that = (DealStatus) o;

        if (getId() != that.getId()) return false;
        if (isFinish() != that.isFinish()) return false;
        return !(getName() != null ? !getName().equals(that.getName()) : that.getName() != null);

    }

    @Override
    public int hashCode() {
        int result = getId();
        result = 31 * result + (getName() != null ? getName().hashCode() : 0);
        result = 31 * result + (isFinish() ? 1 : 0);
        return result;
    }
}
