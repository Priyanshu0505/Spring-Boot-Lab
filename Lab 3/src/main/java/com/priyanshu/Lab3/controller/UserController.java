package com.priyanshu.Lab3.controller;
import com.priyanshu.Lab3.model.User;
import com.priyanshu.Lab3.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;
    @GetMapping
    public List<User> getUsers() {
        return userService.getAllUsers();}
    @PostMapping
    public User createUser(@RequestBody User user) {
        return userService.addUser(user);}
    @GetMapping("/{id}")
    public User getUser(@PathVariable int id) {
        return userService.getUserById(id);}}
