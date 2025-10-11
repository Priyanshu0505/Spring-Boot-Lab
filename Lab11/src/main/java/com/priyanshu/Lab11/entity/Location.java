package com.priyanshu.Lab11.entity;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import java.util.List;
@Entity
@Table(name = "location")
public class Location {
    @Id
    private int id;
    private String name;
    private String address;
    @OneToMany(mappedBy = "location", cascade = CascadeType.ALL)
    @JsonManagedReference      // 👈 Prevent circular JSON (Location → Users → Location)
    private List<User> users;
    // Constructors
    public Location() {}
    public Location(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }
    // Getters & Setters
    public int getId() {
        return id;}
    public void setId(int id) {
        this.id = id;}
    public String getName() {
        return name;}
    public void setName(String name) {
        this.name = name;}
    public String getAddress() {
        return address;}
    public void setAddress(String address) {
        this.address = address;}
    public List<User> getUsers() {
        return users;}
    public void setUsers(List<User> users) {
        this.users = users;}
    }
