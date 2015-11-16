package com.becomejavasenior;


import java.io.Serializable;
import java.util.*;

/**
 * @author Orlov Vladislav on 15.11.2015.
 */
public class User implements Serializable{

    private String login;
    private String password;
    private Set<Role> roles;
    private String firstName;
    private String lastName;
    private String email;
    private String whiteListIP;


    public static Map<String, User> getValidUsers(){

       /* Map<String, User> validUsers = new HashMap<>();
        validUsers.put("Administrator", new User("Administrator", "111", Roles.ADMINISTRATOR));
        validUsers.put("Guest1", new User("Guest", "222", Roles.SUBSCRIBER));
        validUsers.put("Guest2", new User("Guest", "333", Roles.SUBSCRIBER));
        validUsers.put("Guest3", new User("Guest", "444", Roles.SUBSCRIBER));*/

        return null;
    }

    public static List<User> getValidUsersList(){

        /*List< User> validUsers = new ArrayList<>();
        validUsers.add(new User("Administrator", "111", Roles.ADMINISTRATOR, "Andy", "Admynman", "anad@gmail.com"));
        validUsers.add(new User("Guest1", "222", Roles.SUBSCRIBER, "Guest", "Account", "1"));
        validUsers.add(new User("Guest2", "333", Roles.SUBSCRIBER, "Guest", "Account", "2"));
        validUsers.add(new User("Guest3", "444", Roles.SUBSCRIBER, "Guest", "Account", "3"));*/

        return null;
    }

    public User() {
        firstName = "";
        lastName  = "";
    }

    public User(String login, String password, Set<Role> roles) {
        this();
        this.login = login;
        this.password = password;
        this.roles = roles;
    }

    public User(String login, String password, Set<Role> roles, String firstName, String lastName, String email) {
        this.login = login;
        this.password = password;
        this.roles = roles;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
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

    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
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
