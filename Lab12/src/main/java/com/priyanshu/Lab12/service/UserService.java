package com.priyanshu.Lab12.service;
import com.priyanshu.Lab12.entity.User;
import com.priyanshu.Lab12.repository.UserRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    public List<User> findAll() { return userRepository.findAll(); }
    public void save(User user) { userRepository.save(user); }
    public void deleteById(int id) { userRepository.deleteById(id); }
    public Optional<User> findById(int id) { return userRepository.findById(id); }
    public List<User> findByFirstName(String name) { return userRepository.findByFirstName(name); }
    public List<User> findByLastName(String name) { return userRepository.findByLastName(name); }
}
