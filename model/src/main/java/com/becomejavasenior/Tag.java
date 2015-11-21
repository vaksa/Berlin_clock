package com.becomejavasenior;

import java.io.Serializable;
import java.util.Set;

/**
 * @author Orlov Vladislav on 16.11.2015.
 */
public class Tag extends Attacher implements Serializable, Attachable {

    private String name;
    private User owner;

    public Tag() {
    }

    @Override
    public Set<Attachable> getAttachedObjects(Extendable extObject) {
        return Attacher.getAttachedSubclassObjects(extObject, Tag.class);
    }


    @Override
    public int getId() {
        return super.getId();
    }

    @Override
    public void setId(int id) {
        super.setId(id);
    }

    @Override
    public Extendable getAttachedTo() {
        return super.getAttachedTo();
    }

    @Override
    public void setAttachedTo(Extendable attachedTo) {
        super.setAttachedTo(attachedTo);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User getOwner() {
        return owner;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Tag)) return false;

        Tag tag = (Tag) o;

        if(!super.equals(o)) return false;

        if (getName() != null ? !getName().equals(tag.getName()) : tag.getName() != null) return false;
        return !(getOwner() != null ? !getOwner().equals(tag.getOwner()) : tag.getOwner() != null);

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (getName() != null ? getName().hashCode() : 0);
        result = 31 * result + (getOwner() != null ? getOwner().hashCode() : 0);
        return result;
    }
}
