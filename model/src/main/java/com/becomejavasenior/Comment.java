package com.becomejavasenior;

import java.io.Serializable;
import java.util.GregorianCalendar;

/**
 * @author Orlov Vladislav on 16.11.2015.
 */
public class Comment implements Serializable {

    private int id;
    private Tables tableName;
    private String text;
    private User owner;
    private GregorianCalendar date;

    public Comment() {
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

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Comment)) return false;

        Comment comment = (Comment) o;

        if (getId() != comment.getId()) return false;
        return getTableName() == comment.getTableName();

    }

    @Override
    public int hashCode() {
        int result = getId();
        result = 31 * result + (getTableName() != null ? getTableName().hashCode() : 0);
        return result;
    }
}
