package com.priyanshu.Lab08.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name = "users")   // Table will be created as "users" (not reserved keyword)
public class User {
    @Id
    private int id;
    private String name;
    private String email;
    // Default constructor (required by JPA)
    public User() { }
    // Parameterized constructor
    public User(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }
    // Getters and Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
}
