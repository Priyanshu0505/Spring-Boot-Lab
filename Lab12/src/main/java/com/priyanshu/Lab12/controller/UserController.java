package com.priyanshu.Lab12.controller;
import com.priyanshu.Lab12.entity.User;
import com.priyanshu.Lab12.service.UserService;
import com.priyanshu.Lab12.service.LocationService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
@Controller
@RequestMapping("/users")
public class UserController {
    private final UserService userService;
    private final LocationService locationService;
    public UserController(UserService userService, LocationService locationService) {
        this.userService = userService;
        this.locationService = locationService;
    }
    // Display all users
    @GetMapping
    public String getAllUsers(Model model) {
        model.addAttribute("users", userService.findAll());
        model.addAttribute("locations", locationService.findAll());
        model.addAttribute("user", new User());
        return "users";
    }
    // Add new user
    @PostMapping("/add")
    public String addUser(@ModelAttribute("user") User user) {
        userService.save(user);
        return "redirect:/users";
    }
    // Delete user
    @GetMapping("/delete/{id}")
    public String deleteUser(@PathVariable int id) {
        userService.deleteById(id);
        return "redirect:/users";
    }
    // Search by first name
    @GetMapping("/search/firstname")
    public String searchByFirstName(@RequestParam String firstName, Model model) {
        model.addAttribute("users", userService.findByFirstName(firstName));
        model.addAttribute("locations", locationService.findAll());
        model.addAttribute("user", new User());
        return "users";
    }
    // Search by last name
    @GetMapping("/search/lastname")
    public String searchByLastName(@RequestParam String lastName, Model model) {
        model.addAttribute("users", userService.findByLastName(lastName));
        model.addAttribute("locations", locationService.findAll());
        model.addAttribute("user", new User());
        return "users";
    }
}
