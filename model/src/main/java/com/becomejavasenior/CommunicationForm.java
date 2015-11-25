package com.becomejavasenior;

import java.io.Serializable;

/**
 * @author Orlov Vladislav on 16.11.2015.
 */
public class CommunicationForm implements Serializable {

    private int id;
    private String name;
    private CommunicationType communicationType;

    enum CommunicationType{ADDRESS, PHONE, FAX, CELL_PHONE, EMAIL, SOCIAL_NETWORK, INTERNET_COMMUNICATION, SITE}

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

    public CommunicationType getCommunicationType() {
        return communicationType;
    }

    public void setCommunicationType(CommunicationType communicationType) {
        this.communicationType = communicationType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CommunicationForm)) return false;

        CommunicationForm that = (CommunicationForm) o;

        if (getId() != that.getId()) return false;
        return !(getName() != null ? !getName().equals(that.getName()) : that.getName() != null);

    }

    @Override
    public int hashCode() {
        int result = getId();
        result = 31 * result + (getName() != null ? getName().hashCode() : 0);
        return result;
    }
}
