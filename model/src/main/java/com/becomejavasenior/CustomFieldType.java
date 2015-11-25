package com.becomejavasenior;

import java.io.Serializable;

/**
 * @author Orlov Vladislav on 16.11.2015.
 */
public class CustomFieldType implements Serializable {

    private CustomField customField;
    private String name;
    private String smplType;
    private Tables refType;

    public CustomFieldType() {
    }

    public CustomField getCustomField() {
        return customField;
    }

    public void setCustomField(CustomField customField) {
        this.customField = customField;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSmplType() {
        return smplType;
    }

    public void setSmplType(String smplType) {
        this.smplType = smplType;
    }

    public Tables getRefType() {
        return refType;
    }

    public void setRefType(Tables refType) {
        this.refType = refType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CustomFieldType)) return false;

        CustomFieldType that = (CustomFieldType) o;

        if (getCustomField() != null ? !getCustomField().equals(that.getCustomField()) : that.getCustomField() != null)
            return false;
        return !(getName() != null ? !getName().equals(that.getName()) : that.getName() != null);

    }

    @Override
    public int hashCode() {
        int result = getCustomField() != null ? getCustomField().hashCode() : 0;
        result = 31 * result + (getName() != null ? getName().hashCode() : 0);
        return result;
    }
}
