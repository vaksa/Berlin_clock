package com.becomejavasenior;


import java.io.Serializable;

/**
 * @author Orlov Vladislav on 15.11.2015.
 */
public class User implements Serializable{

    private String login;
    private String password;
    private Role role;
    private String firstName;
    private String lastName;
    private String email;
    private String whiteListIP;

    public User() {

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

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
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
        if(lastName.equals("") & firstName.equals("")){
            return login;
        }else {
            return "" + (!lastName.equals("") ? lastName + " " : "")
                    + (!firstName.equals("") ? firstName : "");
        }
    }
}
