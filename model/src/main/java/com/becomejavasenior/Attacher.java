package com.becomejavasenior;

import java.util.Map;
import java.util.Set;

/**
 * @author Orlov Vladislav on 18.11.2015.
 */
abstract public class Attacher<T extends Extendable> implements Attachable{

    private int id;
    private T attachedTo;
    private static Map<Extendable, Set<Attachable>> linksToExtendableObject;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public T getAttachedTo() {
        return attachedTo;
    }

    public void setAttachedTo(T attachedTo) {
        this.attachedTo = attachedTo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Attacher)) return false;

        Attacher attacher = (Attacher) o;

        if (getId() != attacher.getId()) return false;
        return !(getAttachedTo() != null ? !getAttachedTo().equals(attacher.getAttachedTo()) : attacher.getAttachedTo() != null);

    }

    @Override
    public int hashCode() {
        int result = getId();
        result = 31 * result + (getAttachedTo() != null ? getAttachedTo().hashCode() : 0);
        return result;
    }
}
