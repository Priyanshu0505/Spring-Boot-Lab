package com.priyanshu.Lab11.controller;
import com.priyanshu.Lab11.entity.Post;
import com.priyanshu.Lab11.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.time.LocalDate;
import java.util.List;
@RestController
@RequestMapping("/posts")
public class PostController {
    @Autowired
    private PostService postService;
    @PostMapping
    public Post addPost(@RequestBody Post post) {
        return postService.addPost(post);}
    @GetMapping
    public List<Post> getAllPosts() {
        return postService.getAllPosts();}
    @GetMapping("/search/date/{date}")
    public List<Post> searchByDate(@PathVariable String date) {
        return postService.searchByDate(LocalDate.parse(date));}
    }