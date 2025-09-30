package com.priyanshu.Lab07.service;
import com.priyanshu.Lab07.entity.Post;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
@Service
public class PostService {
    private final List<Post> posts = new ArrayList<>();
    public PostService() {
        posts.add(new Post(1, "Welcome Post", "This is the first post."));
        posts.add(new Post(2, "Announcement", "Exam on Friday."));
        posts.add(new Post(3, "Holiday", "Campus will be closed on Monday."));}
    public List<Post> getAllPosts() { return posts; }
    public Optional<Post> getPostById(int id) {
        return posts.stream().filter(p -> p.getId() == id).findFirst();}
    public Post addPost(Post post) {
        posts.add(post);
        return post;}
    public Optional<Post> updatePost(int id, Post updatedPost) {
        return getPostById(id).map(existing -> {
            existing.setTitle(updatedPost.getTitle());
            existing.setContent(updatedPost.getContent());
            return existing;});}
    public boolean deletePost(int id) {
        return posts.removeIf(p -> p.getId() == id);}}
