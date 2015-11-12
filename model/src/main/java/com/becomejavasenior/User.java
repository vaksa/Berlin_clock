package com.becomejavasenior;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class User {

    private String login;
    private String password;
    private Roles role;
    private String firstName;
    private String lastName;
    private String email;

    public enum Roles {ADMINISTRATOR, SUBSCRIBER}

    public static Map<String, User> getValidUsers(){

        Map<String, User> validUsers = new HashMap<>();
        validUsers.put("Administrator", new User("Administrator", "111", Roles.ADMINISTRATOR));
        validUsers.put("Guest1", new User("Guest", "222", Roles.SUBSCRIBER));
        validUsers.put("Guest2", new User("Guest", "333", Roles.SUBSCRIBER));
        validUsers.put("Guest3", new User("Guest", "444", Roles.SUBSCRIBER));

        return validUsers;
    }

    public static List<User> getValidUsersList(){

        List< User> validUsers = new ArrayList<>();
        validUsers.add(new User("Administrator", "111", Roles.ADMINISTRATOR, "Andy", "Admynman", "anad@gmail.com"));
        validUsers.add(new User("Guest1", "222", Roles.SUBSCRIBER, "Guest", "Account", "1"));
        validUsers.add(new User("Guest2", "333", Roles.SUBSCRIBER, "Guest", "Account", "2"));
        validUsers.add(new User("Guest3", "444", Roles.SUBSCRIBER, "Guest", "Account", "3"));

        return validUsers;
    }

    public User() {
        firstName = "";
        lastName  = "";
    }

    public User(String login, String password, Roles role) {
        this();
        this.login = login;
        this.password = password;
        this.role = role;
    }

    public User(String login, String password, Roles role, String firstName, String lastName, String email) {
        this.login = login;
        this.password = password;
        this.role = role;
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

    public Roles getRole() {
        return role;
    }

    public void setRole(Roles role) {
        this.role = role;
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
