package com.becomejavasenior;

import java.io.Serializable;

/**
 * @author Orlov Vladislav on 16.11.2015.
 */
public class Tag implements Serializable {

    private int id;
    private String name;
    private Object owner;
    private Class ownerType;

    public Tag() {
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

    public Object getOwner() {
        return owner;
    }

    public void setOwner(Object owner) {
        this.owner = owner;
    }

    public Class getOwnerType() {
        return ownerType;
    }

    public void setOwnerType(Class ownerType) {
        this.ownerType = ownerType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Tag)) return false;

        Tag tag = (Tag) o;

        if (getId() != tag.getId()) return false;
        if (getName() != null ? !getName().equals(tag.getName()) : tag.getName() != null) return false;
        if (getOwner() != null ? !getOwner().equals(tag.getOwner()) : tag.getOwner() != null) return false;
        return !(getOwnerType() != null ? !getOwnerType().equals(tag.getOwnerType()) : tag.getOwnerType() != null);

    }

    @Override
    public int hashCode() {
        int result = getId();
        result = 31 * result + (getName() != null ? getName().hashCode() : 0);
        result = 31 * result + (getOwner() != null ? getOwner().hashCode() : 0);
        result = 31 * result + (getOwnerType() != null ? getOwnerType().hashCode() : 0);
        return result;
    }
}
