package com.becomejavasenior;

import java.io.Serializable;

/**
 * @author Orlov Vladislav on 16.11.2015.
 */
public class Communication implements Serializable{

    private int id;
    private Communicable owner;
    private CommunicationType type;
    private String value;

    public Communication() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Communicable getOwner() {
        return owner;
    }

    public void setOwner(Communicable owner) {
        this.owner = owner;
    }

    public CommunicationType getType() {
        return type;
    }

    public void setType(CommunicationType type) {
        this.type = type;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Communication)) return false;

        Communication that = (Communication) o;

        return getId() == that.getId();

    }

    @Override
    public int hashCode() {
        return getId();
    }

    /**
     * @author Orlov Vladislav on 16.11.2015.
     */
    public static class CommunicationType implements Serializable {

        private int id;
        private String name;

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

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof CommunicationType)) return false;

            CommunicationType that = (CommunicationType) o;

            return getId() == that.getId();

        }

        @Override
        public int hashCode() {
            return getId();
        }
    }
}
