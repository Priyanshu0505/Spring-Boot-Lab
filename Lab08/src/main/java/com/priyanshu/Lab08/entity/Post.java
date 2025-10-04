package com.priyanshu.Lab08.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name = "post")   // table will be created with name "post"
public class Post {
    @Id
    private int id;
    private String title;
    private String content;
    public Post() { }
    public Post(int id, String title, String content) {
        this.id = id;
        this.title = title;
        this.content = content;
    }
    // getters and setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }
    public String getContent() { return content; }
    public void setContent(String content) { this.content = content; }}



//package com.priyanshu.Lab08.entity;
//
//public class Post {
//    private int id;
//    private String title;
//    private String content;
//    public Post() { }
//    public Post(int id, String title, String content) {
//        this.id = id;
//        this.title = title;
//        this.content = content;}
//    // getters and setters
//    public int getId() { return id; }
//    public void setId(int id) { this.id = id; }
//    public String getTitle() { return title; }
//    public void setTitle(String title) { this.title = title; }
//    public String getContent() { return content; }
//    public void setContent(String content) { this.content = content; }}
//
