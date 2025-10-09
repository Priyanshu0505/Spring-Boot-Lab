package com.priyanshu.Lab10.service;
import com.priyanshu.Lab10.entity.User;
import com.priyanshu.Lab10.repository.UserRepository;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class UserService {
    private final UserRepository userRepository;
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    // Create
    public User addUser(User user) {
        return userRepository.save(user);
    }
    // Read all
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
    // Read by ID
    public User getUserById(int id) {
        return userRepository.findById(id).orElse(null);
    }
    // Update
    public User updateUser(int id, User user) {
        user.setId(id);
        return userRepository.save(user);
    }
    // Delete
    public void deleteUser(int id) {
        userRepository.deleteById(id);
    }}
