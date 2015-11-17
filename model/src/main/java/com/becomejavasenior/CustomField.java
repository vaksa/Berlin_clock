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
    private Class ownerType;

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

    public Class getOwnerType() {
        return ownerType;
    }

    public void setOwnerType(Class ownerType) {
        this.ownerType = ownerType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CustomField)) return false;

        CustomField that = (CustomField) o;

        if (getId() != that.getId()) return false;
        if (getFieldType() != null ? !getFieldType().equals(that.getFieldType()) : that.getFieldType() != null)
            return false;
        if (getFieldValue() != null ? !getFieldValue().equals(that.getFieldValue()) : that.getFieldValue() != null)
            return false;
        if (getOwner() != null ? !getOwner().equals(that.getOwner()) : that.getOwner() != null) return false;
        return !(getOwnerType() != null ? !getOwnerType().equals(that.getOwnerType()) : that.getOwnerType() != null);

    }

    @Override
    public int hashCode() {
        int result = getId();
        result = 31 * result + (getFieldType() != null ? getFieldType().hashCode() : 0);
        result = 31 * result + (getFieldValue() != null ? getFieldValue().hashCode() : 0);
        result = 31 * result + (getOwner() != null ? getOwner().hashCode() : 0);
        result = 31 * result + (getOwnerType() != null ? getOwnerType().hashCode() : 0);
        return result;
    }
}
