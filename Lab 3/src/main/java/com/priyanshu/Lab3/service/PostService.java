package com.priyanshu.Lab3.service;
import com.priyanshu.Lab3.model.Post;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
@Service
public class PostService {
    private final List<Post> posts = new ArrayList<>();
    public PostService() {
        // Adding some dummy data
        posts.add(new Post(1, "First Post", "Hello World."));
        posts.add(new Post(2, "Second Post", "Hello Section D."));}
    public List<Post> getAllPosts() {
        return posts;}
    public Post addPost(Post post) {
        posts.add(post);
        return post; }   // ✅ return the added post
    public Post getPostById(int id) {
        return posts.stream()
                .filter(p -> p.getId() == id)
                .findFirst()
                .orElse(null);}}