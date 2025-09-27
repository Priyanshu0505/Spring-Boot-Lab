package com.priyanshu.Lab06.controller;
import com.priyanshu.Lab06.entity.Post;
import com.priyanshu.Lab06.service.PostService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/posts")
public class PostController {
    private final PostService postService;
    public PostController(PostService postService) {
        this.postService = postService;}
    @GetMapping("/{id}")
    public ResponseEntity<?> getPostById(@PathVariable int id) {
        System.out.println("PostController/ Posts / " + id);
        return postService.getPostById(id)
                .<ResponseEntity<?>>map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.status(HttpStatus.NOT_FOUND)
                        .body("Post with id " + id + " not found"));}}
