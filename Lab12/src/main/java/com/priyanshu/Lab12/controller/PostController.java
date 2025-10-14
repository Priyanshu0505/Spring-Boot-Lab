package com.priyanshu.Lab12.controller;
import com.priyanshu.Lab12.entity.Post;
import com.priyanshu.Lab12.service.PostService;
import com.priyanshu.Lab12.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import java.time.LocalDate;
@Controller
@RequestMapping("/posts")
public class PostController {
    private final PostService postService;
    private final UserService userService;
    public PostController(PostService postService, UserService userService) {
        this.postService = postService;
        this.userService = userService;
    }
    // Show all posts
    @GetMapping
    public String getAllPosts(Model model) {
        model.addAttribute("posts", postService.findAll());
        model.addAttribute("users", userService.findAll());
        model.addAttribute("post", new Post());
        return "posts";
    }
    // Add new post
    @PostMapping("/add")
    public String addPost(@ModelAttribute("post") Post post) {
        postService.save(post);
        return "redirect:/posts";
    }
    // Delete post
    @GetMapping("/delete/{id}")
    public String deletePost(@PathVariable int id) {
        postService.deleteById(id);
        return "redirect:/posts";
    }
    // Search posts by date
    @GetMapping("/search/date")
    public String searchByDate(@RequestParam String date, Model model) {
        LocalDate localDate = LocalDate.parse(date);
        model.addAttribute("posts", postService.findByDate(localDate));
        model.addAttribute("users", userService.findAll());
        model.addAttribute("post", new Post());
        return "posts";
    }
}
