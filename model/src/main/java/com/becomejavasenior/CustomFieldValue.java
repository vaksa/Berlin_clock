package com.becomejavasenior;

import java.io.Serializable;

/**
 * @author Orlov Vladislav on 16.11.2015.
 */
public class CustomFieldValue<T> implements Serializable {

    private int id;
    private int record_id;
    private T value;

    public CustomFieldValue() {

    }

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

    public int getRecord_id() {
        return record_id;
    }

    public void setRecord_id(int record_id) {
        this.record_id = record_id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CustomFieldValue)) return false;

        CustomFieldValue<?> that = (CustomFieldValue<?>) o;

        if (getId() != that.getId()) return false;
        return getRecord_id() == that.getRecord_id();

    }

    @Override
    public int hashCode() {
        int result = getId();
        result = 31 * result + getRecord_id();
        return result;
    }
}
