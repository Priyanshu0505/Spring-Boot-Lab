package com.priyanshu.Lab10.entity;
import jakarta.persistence.*;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnore;
@Entity
@Table(name = "users")
public class User {
    @Id
    private int id;
    private String name;
    private String email;
    // Many users can belong to one location
    @ManyToOne
    @JoinColumn(name = "location_id")
    private Location location;
    // One user can have many posts
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    @JsonIgnore   // prevents post → user → post infinite loop
    private List<Post> posts;
    public User() { }
    public User(int id, String name, String email, Location location) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.location = location;}
    // Getters and Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public Location getLocation() { return location; }
    public void setLocation(Location location) { this.location = location; }
    public List<Post> getPosts() { return posts; }
    public void setPosts(List<Post> posts) { this.posts = posts; }}
