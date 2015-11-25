package com.becomejavasenior;

import java.io.Serializable;

/**
 * @author Orlov Vladislav on 23.11.2015.
 */
public class Permition implements Serializable{

    private Role role;
    private tables table;
    private boolean canRead;
    private boolean canWrite;
    private boolean canDelete;

    enum tables{COMPANY, DEAL, TASK, CONTACT}

    public Permition() {

    }

    public boolean isCanRead() {
        return canRead;
    }

    public void setCanRead(boolean canRead) {
        this.canRead = canRead;
    }

    public boolean isCanWrite() {
        return canWrite;
    }

    public void setCanWrite(boolean canWrite) {
        this.canWrite = canWrite;
    }

    public boolean isCanDelete() {
        return canDelete;
    }

    public void setCanDelete(boolean canDelete) {
        this.canDelete = canDelete;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public tables getTable() {
        return table;
    }

    public void setTable(tables table) {
        this.table = table;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Permition)) return false;

        Permition permition = (Permition) o;

        if (getRole() != null ? !getRole().equals(permition.getRole()) : permition.getRole() != null) return false;
        return getTable() == permition.getTable();

    }

    @Override
    public int hashCode() {
        int result = getRole() != null ? getRole().hashCode() : 0;
        result = 31 * result + (getTable() != null ? getTable().hashCode() : 0);
        return result;
    }
}
