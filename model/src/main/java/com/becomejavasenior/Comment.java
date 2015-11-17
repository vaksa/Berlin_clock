package com.becomejavasenior;

import java.io.Serializable;

/**
 * @author Orlov Vladislav on 16.11.2015.
 */
public class Comment implements Serializable {

    private int id;
    private Comment comment;
    private Object owner;
    private Class ownerType;

    public Comment() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Comment getComment() {
        return comment;
    }

    public void setComment(Comment comment) {
        this.comment = comment;
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
        if (!(o instanceof Comment)) return false;

        Comment comment1 = (Comment) o;

        if (getId() != comment1.getId()) return false;
        if (getComment() != null ? !getComment().equals(comment1.getComment()) : comment1.getComment() != null)
            return false;
        if (getOwner() != null ? !getOwner().equals(comment1.getOwner()) : comment1.getOwner() != null) return false;
        return !(getOwnerType() != null ? !getOwnerType().equals(comment1.getOwnerType()) : comment1.getOwnerType() != null);

    }

    @Override
    public int hashCode() {
        int result = getId();
        result = 31 * result + (getComment() != null ? getComment().hashCode() : 0);
        result = 31 * result + (getOwner() != null ? getOwner().hashCode() : 0);
        result = 31 * result + (getOwnerType() != null ? getOwnerType().hashCode() : 0);
        return result;
    }
}
