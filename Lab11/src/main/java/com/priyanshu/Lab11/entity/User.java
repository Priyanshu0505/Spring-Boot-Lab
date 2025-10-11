package com.priyanshu.Lab11.entity;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import java.util.List;
@Entity
@Table(name = "users")
public class User {
    @Id
    private int id;
    private String firstName;
    private String lastName;
    private String email;
    @ManyToOne
    @JoinColumn(name = "location_id")
    @JsonBackReference        // 👈 Prevent circular reference (User → Location → User)
    private Location location;
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    @JsonManagedReference     // 👈 Prevent circular reference (User → Post → User)
    private List<Post> posts;
    // Constructors
    public User() {}
    public User(int id, String firstName, String lastName, String email, Location location) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.location = location;
    }
    // Getters & Setters
    public int getId() {
        return id;}
    public void setId(int id) {
        this.id = id;}
    public String getFirstName() {
        return firstName;}
    public void setFirstName(String firstName) {
        this.firstName = firstName;}
    public String getLastName() {
        return lastName;}
    public void setLastName(String lastName) {
        this.lastName = lastName;}
    public String getEmail() {
        return email;}
    public void setEmail(String email) {
        this.email = email;}
    public Location getLocation() {
        return location;}
    public void setLocation(Location location) {
        this.location = location;}
    public List<Post> getPosts() {
        return posts;}
    public void setPosts(List<Post> posts) {
        this.posts = posts;}
    }

