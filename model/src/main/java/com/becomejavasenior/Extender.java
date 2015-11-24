package com.becomejavasenior;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Orlov Vladislav on 18.11.2015.
 */
abstract public class Extender implements Extendable {

    private int id;
    private Set<Attachable> attachedCustomFields;

    public Extender() {
        attachedCustomFields = new HashSet<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Set<Attachable> getAttachedCustomFields() {
        return attachedCustomFields;
    }

    public void setAttachedCustomFields(Set<Attachable> attachedCustomFields) {
        this.attachedCustomFields = attachedCustomFields;
    }

   @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Extender)) return false;

        Extender extender = (Extender) o;

        return getId() == extender.getId();
    }

    @Override
    public int hashCode() {
        return getId();
    }


}
