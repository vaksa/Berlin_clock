package com.becomejavasenior;

import java.io.Serializable;

/**
 * @author Orlov Vladislav on 16.11.2015.
 */
public class CustomField extends Attacher implements Serializable {

    private CustomFieldType fieldType;
    private CustomFieldValue fieldValue;

    public CustomField() {
    }

    @Override
    public int getId() {
        return super.getId();
    }

    @Override
    public void setId(int id) {
        super.setId(id);
    }

    @Override
    public Extendable getAttachedTo() {
        return super.getAttachedTo();
    }

    @Override
    public void setAttachedTo(Extendable attachedTo) {
        super.setAttachedTo(attachedTo);
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CustomField)) return false;

        CustomField that = (CustomField) o;

        if(!super.equals(o)) return false;

        if (getFieldType() != null ? !getFieldType().equals(that.getFieldType()) : that.getFieldType() != null)
            return false;
        return !(getFieldValue() != null ? !getFieldValue().equals(that.getFieldValue()) : that.getFieldValue() != null);

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result +(getFieldType() != null ? getFieldType().hashCode() : 0);
        result = 31 * result + (getFieldValue() != null ? getFieldValue().hashCode() : 0);
        return result;
    }
}
