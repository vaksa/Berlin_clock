package com.becomejavasenior;

/**
 * @author Orlov Vladislav on 16.11.2015.
 */
public class CustomFieldValue {

    private int id;
    private Object value;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
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
