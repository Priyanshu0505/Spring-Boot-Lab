package com.priyanshu.Lab10.controller;
import com.priyanshu.Lab10.entity.User;
import com.priyanshu.Lab10.service.UserService;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping("/users")
public class UserController {
    private final UserService userService;
    public UserController(UserService userService) {
        this.userService = userService;}
    // ➕ CREATE
    @PostMapping
    public User addUser(@RequestBody User user) {
        return userService.addUser(user);}
    // 📜 READ ALL
    @GetMapping
    public List<User> getAllUsers() {
        return userService.getAllUsers();}
    // 🔍 READ BY ID
    @GetMapping("/{id}")
    public User getUserById(@PathVariable int id) {
        return userService.getUserById(id);}
    // ✏️ UPDATE
    @PutMapping("/{id}")
    public User updateUser(@PathVariable int id, @RequestBody User user) {
        return userService.updateUser(id, user);}
    // ❌ DELETE
    @DeleteMapping("/{id}")
    public String deleteUser(@PathVariable int id) {
        userService.deleteUser(id);
        return "User deleted successfully!";}}
