package com.priyanshu.Lab11.controller;
import com.priyanshu.Lab11.entity.User;
import com.priyanshu.Lab11.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;
    @PostMapping
    public User addUser(@RequestBody User user) {
        return userService.addUser(user);}
    @GetMapping
    public List<User> getAllUsers() {
        return userService.getAllUsers();}
    @GetMapping("/search/firstname/{firstName}")
    public List<User> searchByFirstName(@PathVariable String firstName) {
        return userService.searchByFirstName(firstName);}
    @GetMapping("/search/lastname/{lastName}")
    public List<User> searchByLastName(@PathVariable String lastName) {
        return userService.searchByLastName(lastName);}
    }