package com.j2eeapi.com.model;

import javax.persistence.*;
import java.util.set;

@Entity
@Table(name = "users")
public class User{
    @Id
    private Long id;
    private String name;
    private String email;
    private String password;

    // Getter

    public Long getId() {
        return id;
    }

    public String getName(){
        return name
    }

    public String getEmail() {
        return email;
    }

    // Setter

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

}