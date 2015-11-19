package com.becomejavasenior;

import java.io.Serializable;

/**
 * @author Orlov Vladislav on 16.11.2015.
 */
public class CustomFieldValue<T> implements Serializable {

    private int id;
    private T value;
    private String stringValue;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public String getStringValue() {
        return stringValue;
    }

    public void setStringValue(String stringValue) {
        this.stringValue = stringValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CustomFieldValue)) return false;

        CustomFieldValue that = (CustomFieldValue) o;

        if (getId() != that.getId()) return false;
        return !(getValue() != null ? !getValue().equals(that.getValue()) : that.getValue() != null);

    }

    @Override
    public int hashCode() {
        int result = getId();
        result = 31 * result + (getValue() != null ? getValue().hashCode() : 0);
        return result;
    }
}
