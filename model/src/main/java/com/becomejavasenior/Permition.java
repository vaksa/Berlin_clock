package com.becomejavasenior;

/**
 * @author Orlov Vladislav on 23.11.2015.
 */
public class Permition {

    private boolean canRead;
    private boolean canWrite;
    private boolean canDelete;
    private tables table;

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

    public tables getTable() {
        return table;
    }

    public void setTable(tables table) {
        this.table = table;
    }
}
