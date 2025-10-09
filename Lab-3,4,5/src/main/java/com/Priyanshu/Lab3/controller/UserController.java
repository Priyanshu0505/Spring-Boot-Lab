package com.Priyanshu.Lab3.controller;

import com.Priyanshu.Lab3.entity.Location;
import com.Priyanshu.Lab3.entity.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class UserController {

    @GetMapping("/users")
    public List<User> getUsers() {
        Location location1 = new Location("L1", "Delhi");
        Location location2 = new Location("L2", "Mumbai");

        User user1 = new User("U1", "Priyanshu", "Raj", location1, "priyanshu@gmail.com");
        User user2 = new User("U2", "Aman", "Kumar", location2, "aman@gmail.com");

        return Arrays.asList(user1, user2);
    }
}
