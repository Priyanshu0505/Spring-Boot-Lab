package com.Priyanshu.Lab3.controller;

import com.Priyanshu.Lab3.entity.Location;
import com.Priyanshu.Lab3.entity.Post;
import com.Priyanshu.Lab3.entity.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class PostController {

    @GetMapping("/posts")
    public List<Post> getPosts() {
        Location loc = new Location("L1", "Delhi");
        User user = new User("U1", "Priyanshu", "Raj", loc, "priyanshu@gmail.com");

        Post post1 = new Post("P1", "2025-08-27", user, "Hello World!");
        Post post2 = new Post("P2", "2025-08-26", user, "Spring Boot MVC Practice");

        return Arrays.asList(post1, post2);
    }
}
