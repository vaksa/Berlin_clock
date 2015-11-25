package com.becomejavasenior;

import java.io.Serializable;

/**
 * @author Orlov Vladislav on 17.11.2015.
 */
public class DealContact implements Serializable {

    private int id;
    private Deal deal;
    private Contact contact;
    private Boolean isMain;

    public DealContact() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Deal getDeal() {
        return deal;
    }

    public void setDeal(Deal deal) {
        this.deal = deal;
    }

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    public Boolean getIsMain() {
        return isMain;
    }

    public void setIsMain(Boolean isMain) {
        this.isMain = isMain;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof DealContact)) return false;

        DealContact that = (DealContact) o;

        if (getId() != that.getId()) return false;
        if (getDeal() != null ? !getDeal().equals(that.getDeal()) : that.getDeal() != null) return false;
        if (getContact() != null ? !getContact().equals(that.getContact()) : that.getContact() != null) return false;
        return !(getIsMain() != null ? !getIsMain().equals(that.getIsMain()) : that.getIsMain() != null);

    }

    @Override
    public int hashCode() {
        int result = getId();
        result = 31 * result + (getDeal() != null ? getDeal().hashCode() : 0);
        result = 31 * result + (getContact() != null ? getContact().hashCode() : 0);
        result = 31 * result + (getIsMain() != null ? getIsMain().hashCode() : 0);
        return result;
    }
}
