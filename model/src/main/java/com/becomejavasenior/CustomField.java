package com.becomejavasenior;

import java.io.Serializable;

/**
 * @author Orlov Vladislav on 16.11.2015.
 */
public class CustomField implements Serializable {

    private int id;
    private Tables tableName;
    private CustomFieldType fieldType;
    private CustomFieldValue fieldValue;

    public CustomField() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Tables getTableName() {
        return tableName;
    }

    public void setTableName(Tables tableName) {
        this.tableName = tableName;
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

        if (getId() != that.getId()) return false;
        return getTableName() == that.getTableName();

    }

    @Override
    public int hashCode() {
        int result = getId();
        result = 31 * result + (getTableName() != null ? getTableName().hashCode() : 0);
        return result;
    }
}
