package com.priyanshu.Lab3.controller;
import com.priyanshu.Lab3.model.Post;
import com.priyanshu.Lab3.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping("/posts")
public class PostController {
    @Autowired
    private PostService postService;
    @GetMapping
    public List<Post> getPosts() {
        return postService.getAllPosts();}
    @PostMapping
    public Post createPost(@RequestBody Post post) {
        return postService.addPost(post);}
    @GetMapping("/{id}")
    public Post getPost(@PathVariable int id) {
        return postService.getPostById(id);}}
