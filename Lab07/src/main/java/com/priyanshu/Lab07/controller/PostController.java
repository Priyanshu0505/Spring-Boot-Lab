package com.priyanshu.Lab07.controller;
import com.priyanshu.Lab07.entity.Post;
import com.priyanshu.Lab07.service.PostService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/posts")

public class PostController {
    private final PostService postService;
    public PostController(PostService postService) { this.postService = postService; }
    @GetMapping("/{id}")
    public ResponseEntity<?> getPostById(@PathVariable int id) {
        System.out.println("PostController/ Posts / " + id);
        return postService.getPostById(id)
                .<ResponseEntity<?>>map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.status(HttpStatus.NOT_FOUND)
                        .body("Post with id " + id + " not found"));
    }

    @PostMapping
    public ResponseEntity<Post> addPost(@RequestBody Post post) {
        return ResponseEntity.status(HttpStatus.CREATED).body(postService.addPost(post));
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> updatePost(@PathVariable int id, @RequestBody Post post) {
        return postService.updatePost(id, post)
                .<ResponseEntity<?>>map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.status(HttpStatus.NOT_FOUND)
                        .body("Post with id " + id + " not found"));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deletePost(@PathVariable int id) {
        if (postService.deletePost(id)) {
            return ResponseEntity.ok("Post deleted successfully");
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("Post with id " + id + " not found");
        }
    }
}
