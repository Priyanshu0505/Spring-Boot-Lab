package com.priyanshu.Lab09.service;
import com.priyanshu.Lab09.entity.Post;
import com.priyanshu.Lab09.repository.PostRepository;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class PostService {
    private final PostRepository postRepository;
    public PostService(PostRepository postRepository) {
        this.postRepository = postRepository;
    }
    // Create
    public Post addPost(Post post) {
        return postRepository.save(post);
    }
    // Read all
    public List<Post> getAllPosts() {
        return postRepository.findAll();
    }
    // Read by ID
    public Post getPostById(int id) {
        return postRepository.findById(id).orElse(null);
    }
    // Update
    public Post updatePost(int id, Post post) {
        post.setId(id);
        return postRepository.save(post);
    }
    // Delete
    public void deletePost(int id) {
        postRepository.deleteById(id);
    }}
