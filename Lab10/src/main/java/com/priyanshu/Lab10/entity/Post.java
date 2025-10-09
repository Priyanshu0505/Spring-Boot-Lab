package com.priyanshu.Lab10.entity;
import jakarta.persistence.*;
@Entity
@Table(name = "post")
public class Post {
    @Id
    private int id;
    private String title;
    private String content;
    // Many posts belong to one user
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
    public Post() { }
    public Post(int id, String title, String content, User user) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.user = user;
    }
    // Getters and Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }
    public String getContent() { return content; }
    public void setContent(String content) { this.content = content; }
    public User getUser() { return user; }
    public void setUser(User user) { this.user = user; }
}
