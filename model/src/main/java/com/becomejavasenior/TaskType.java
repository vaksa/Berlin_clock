package com.becomejavasenior;

import java.io.Serializable;

/**
 * @author Orlov Vladislav on 17.11.2015.
 */
public class TaskType implements Serializable {

    private int id;
    private String name;

    public TaskType() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TaskType)) return false;

        TaskType taskType = (TaskType) o;

        if (getId() != taskType.getId()) return false;
        return !(getName() != null ? !getName().equals(taskType.getName()) : taskType.getName() != null);

    }

    @Override
    public int hashCode() {
        int result = getId();
        result = 31 * result + (getName() != null ? getName().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return name;
    }
}
