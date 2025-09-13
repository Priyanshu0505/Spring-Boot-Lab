package com.priyanshu.Lab3.service;
import com.priyanshu.Lab3.model.User;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
@Service
public class UserService {
    private final List<User> user = new ArrayList<>();
    public UserService() {
        // Adding some dummy data
        user.add(new User(1, "Priyanshu", "priyanshu05@gmail.com"));
        user.add(new User(2, "Aditya", "aditya4@gmail.com"));}
    public List<User> getAllUsers() {
        return user;
    }
    public User addUser(User user) {
        getAllUsers().add(user);
        return user;
    }
    public User getUserById(int id) {
        return user.stream()
                .filter(u -> u.getId() == id)
                .findFirst()
                .orElse(null);}}
