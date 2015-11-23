package com.becomejavasenior;

import java.io.Serializable;
import java.util.Arrays;
import java.util.GregorianCalendar;
import java.util.Set;

/**
 * @author Orlov Vladislav on 16.11.2015.
 */
public class Attachment extends Attacher implements Serializable, Attachable {

    private User owner;
    private GregorianCalendar date;
    private String pathToFile;
    private byte[] data;

    public Attachment() {
    }

    @Override
    public Set<Attachable> getAttachedObjects(Extendable extObject) {
        return null;
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

    public GregorianCalendar getDate() {
        return date;
    }

    public void setDate(GregorianCalendar date) {
        this.date = date;
    }

    public User getOwner() {
        return owner;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }

    public String getPathToFile() {
        return pathToFile;
    }

    public void setPathToFile(String pathToFile) {
        this.pathToFile = pathToFile;
    }

    public byte[] getData() {
        return data;
    }

    public void setData(byte[] data) {
        this.data = data;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Attachment)) return false;

        Attachment that = (Attachment) o;

        if (getOwner() != null ? !getOwner().equals(that.getOwner()) : that.getOwner() != null) return false;
        if (getPathToFile() != null ? !getPathToFile().equals(that.getPathToFile()) : that.getPathToFile() != null)
            return false;
        return Arrays.equals(getData(), that.getData());

    }

    @Override
    public int hashCode() {
        int result = getOwner() != null ? getOwner().hashCode() : 0;
        result = 31 * result + (getPathToFile() != null ? getPathToFile().hashCode() : 0);
        result = 31 * result + (getData() != null ? Arrays.hashCode(getData()) : 0);
        return result;
    }
}
