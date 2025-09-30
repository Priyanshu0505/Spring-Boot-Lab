package com.priyanshu.Lab07.service;
import com.priyanshu.Lab07.entity.User;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
@Service
public class UserService {
    private final List<User> users = new ArrayList<>();
    public UserService() {
        users.add(new User(1, "Aman Kumar", "aman@example.com"));
        users.add(new User(2, "Rahul Verma", "rahul@example.com"));
        users.add(new User(3, "Sonia Singh", "sonia@example.com"));}
    // READ
    public List<User> getAllUsers() {
        return users;}
    public Optional<User> getUserById(int id) {
        return users.stream().filter(u -> u.getId() == id).findFirst();}
    // CREATE
    public User addUser(User user) {
        users.add(user);
        return user;}
    // UPDATE
    public Optional<User> updateUser(int id, User updatedUser) {
        return getUserById(id).map(existing -> {
            existing.setName(updatedUser.getName());
            existing.setEmail(updatedUser.getEmail());
            return existing;});}
    // DELETE
    public boolean deleteUser(int id) {
        return users.removeIf(u -> u.getId() == id);}}
