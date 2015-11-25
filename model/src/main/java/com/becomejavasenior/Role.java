package com.becomejavasenior;

import java.io.Serializable;
import java.util.Set;

/**
 * @author Orlov Vladislav on 16.11.2015.
 */
public class Role implements Serializable {

    private int id;
    private String name;
    private Set<Permition> permissions;
    private RoleType roleType;

    enum RoleType{ADMIN, MANAGER, ACCOUNTANT}

    public Role() {

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

    public Set<Permition> getPermissions() {
        return permissions;
    }

    public void setPermissions(Set<Permition> permissions) {
        this.permissions = permissions;
    }

    public RoleType getRoleType() {
        return roleType;
    }

    public void setRoleType(RoleType roleType) {
        this.roleType = roleType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Role)) return false;

        Role role = (Role) o;

        if (!getName().equals(role.getName())) return false;
        if (!getPermissions().equals(role.getPermissions())) return false;
        return getRoleType() == role.getRoleType();

    }

    @Override
    public int hashCode() {
        int result = getName().hashCode();
        result = 31 * result + getPermissions().hashCode();
        result = 31 * result + getRoleType().hashCode();
        return result;
    }
}
