package com.example.springsecurityfinal;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class User {

    @Id
    @GeneratedValue
    private long id;
    private String username;
    private String password;

    private boolean active;
    private  String role; //it will have all roles seperated by comma

    public User() {
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return username;
    }

    public String getRole() {
        return role;
    }

    public String getPassword() {
        return password;
    }

    public boolean isActive() {
        return active;
    }
}
