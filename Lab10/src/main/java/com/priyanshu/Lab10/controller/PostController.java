package com.priyanshu.Lab10.controller;
import com.priyanshu.Lab10.entity.Post;
import com.priyanshu.Lab10.service.PostService;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping("/posts")
public class PostController {
    private final PostService postService;
    public PostController(PostService postService) {
        this.postService = postService;
    }
    @PostMapping
    public Post addPost(@RequestBody Post post) {
        return postService.addPost(post);
    }
    @GetMapping
    public List<Post> getAllPosts() {
        return postService.getAllPosts();
    }
    @GetMapping("/{id}")
    public Post getPostById(@PathVariable int id) {
        return postService.getPostById(id);
    }
    @PutMapping("/{id}")
    public Post updatePost(@PathVariable int id, @RequestBody Post post) {
        return postService.updatePost(id, post);
    }
    @DeleteMapping("/{id}")
    public String deletePost(@PathVariable int id) {
        postService.deletePost(id);
        return "Post deleted successfully!";}}
