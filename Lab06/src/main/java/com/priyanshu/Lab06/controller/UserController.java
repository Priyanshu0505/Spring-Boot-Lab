package com.priyanshu.Lab06.controller;
import com.priyanshu.Lab06.entity.User;
import com.priyanshu.Lab06.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/users")
public class UserController {
    private final UserService userService;
    public UserController(UserService userService) {
        this.userService = userService;}
    @GetMapping("/{id}")
    public ResponseEntity<?> getUserById(@PathVariable int id) {
        System.out.println("UserController/ Users / " + id);
        return userService.getUserById(id)
                .<ResponseEntity<?>>map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.status(HttpStatus.NOT_FOUND)
                        .body("User with id " + id + " not found"));}}
