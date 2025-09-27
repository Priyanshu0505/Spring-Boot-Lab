package com.priyanshu.Lab06.service;
import com.priyanshu.Lab06.entity.User;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
@Service
public class UserService {
    private final List<User> users = new ArrayList<>();
    public UserService() {
        // sample data (3 users as in your lab doc)
        users.add(new User(1, "Aman Kumar", "aman@example.com"));
        users.add(new User(2, "Rahul Verma", "rahul@example.com"));
        users.add(new User(3, "Sonia Singh", "sonia@example.com"));}
    public List<User> getAllUsers() {
        return users;}
    public Optional<User> getUserById(int id) {
        return users.stream().filter(u -> u.getId() == id).findFirst();}}

