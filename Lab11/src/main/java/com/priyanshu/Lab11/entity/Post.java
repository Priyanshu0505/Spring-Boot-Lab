package com.priyanshu.Lab11.entity;
import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import java.time.LocalDate;
@Entity
@Table(name = "post")
public class Post {
    @Id
    private int id;
    private String title;
    private String content;
    private LocalDate date;
    @ManyToOne
    @JoinColumn(name = "user_id")
    @JsonBackReference        // 👈 Prevent infinite loop (Post → User → Post)
    private User user;
    // Constructors
    public Post() {}
    public Post(int id, String title, String content, LocalDate date, User user) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.date = date;
        this.user = user;
    }
    // Getters & Setters
    public int getId() {
        return id;}
    public void setId(int id) {
        this.id = id;}
    public String getTitle() {
        return title;}
    public void setTitle(String title) {
        this.title = title;}
    public String getContent() {
        return content;}
    public void setContent(String content) {
        this.content = content;}
    public LocalDate getDate() {
        return date;}
    public void setDate(LocalDate date) {
        this.date = date;}
    public User getUser() {
        return user;}
    public void setUser(User user) {
        this.user = user;}
    }

