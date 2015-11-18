package com.becomejavasenior;

import java.io.Serializable;

/**
 * @author Orlov Vladislav on 18.11.2015.
 */
public abstract class Person implements Serializable{

    private int id;
    private String firstName;
    private String lastName;

    public Person() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;

        Person person = (Person) o;

        if (getId() != person.getId()) return false;
        if (getFirstName() != null ? !getFirstName().equals(person.getFirstName()) : person.getFirstName() != null)
            return false;
        return !(getLastName() != null ? !getLastName().equals(person.getLastName()) : person.getLastName() != null);

    }

    @Override
    public int hashCode() {
        int result = getId();
        result = 31 * result + (getFirstName() != null ? getFirstName().hashCode() : 0);
        result = 31 * result + (getLastName() != null ? getLastName().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
            return "" + (!lastName.equals("") ? lastName + " " : "")
                    + (!firstName.equals("") ? firstName : "");

    }
}
