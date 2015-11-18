package com.becomejavasenior;


import java.io.Serializable;

/**
 * @author Orlov Vladislav on 15.11.2015.
 */
public class User extends Person implements Serializable{

    private String login;
    private String password;
    private String email;
    private Role role;
    private String whiteListIP;

    public User() {

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
    public String getFirstName() {
        return super.getFirstName();
    }

    @Override
    public void setFirstName(String firstName) {
        super.setFirstName(firstName);
    }

    @Override
    public String getLastName() {
        return super.getLastName();
    }

    @Override
    public void setLastName(String lastName) {
        super.setFirstName(lastName);
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public String getWhiteListIP() {
        return whiteListIP;
    }

    public void setWhiteListIP(String whiteListIP) {
        this.whiteListIP = whiteListIP;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;

        User user = (User) o;

        if (!getLogin().equals(user.getLogin())) return false;
        return getEmail().equals(user.getEmail());

    }

    @Override
    public int hashCode() {
        int result = getLogin().hashCode();
        result = 31 * result + getEmail().hashCode();
        return result;
    }

    @Override
    public String toString() {
        if(getLastName().equals("") & getFirstName().equals("")){
            return login;
        }else {
            return super.toString();
        }
    }
}
