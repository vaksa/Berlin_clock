package com.becomejavasenior;

import java.io.Serializable;
import java.util.GregorianCalendar;

/**
 * @author Orlov Vladislav on 16.11.2015.
 */
public class File implements Serializable {

    private int id;
    private Tables tableName;
    private User owner;
    private GregorianCalendar date;
    private String pathToFile;
    private byte[] data;

    public File() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Tables getTableName() {
        return tableName;
    }

    public void setTableName(Tables tableName) {
        this.tableName = tableName;
    }

    public User getOwner() {
        return owner;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }

    public GregorianCalendar getDate() {
        return date;
    }

    public void setDate(GregorianCalendar date) {
        this.date = date;
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
        if (!(o instanceof File)) return false;

        File that = (File) o;

        if (getId() != that.getId()) return false;
        if (getTableName() != that.getTableName()) return false;
        return !(getDate() != null ? !getDate().equals(that.getDate()) : that.getDate() != null);

    }

    @Override
    public int hashCode() {
        int result = getId();
        result = 31 * result + (getTableName() != null ? getTableName().hashCode() : 0);
        result = 31 * result + (getDate() != null ? getDate().hashCode() : 0);
        return result;
    }
}
