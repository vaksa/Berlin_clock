package com.becomejavasenior;

import java.io.Serializable;

/**
 * @author Orlov Vladislav on 16.11.2015.
 */
public class CustomField implements Serializable {

    private int id;
    private CustomFieldType fieldType;
    private CustomFieldValue fieldValue;
    private Object owner;

    public CustomField() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public CustomFieldType getFieldType() {
        return fieldType;
    }

    public void setFieldType(CustomFieldType fieldType) {
        this.fieldType = fieldType;
    }

    public CustomFieldValue getFieldValue() {
        return fieldValue;
    }

    public void setFieldValue(CustomFieldValue fieldValue) {
        this.fieldValue = fieldValue;
    }

    public Object getOwner() {
        return owner;
    }

    public void setOwner(Object owner) {
        this.owner = owner;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CustomField)) return false;

        CustomField that = (CustomField) o;

        return getId() == that.getId();

    }

    @Override
    public int hashCode() {
        return getId();
    }
}
