package com.priyanshu.Lab11.repository;
import com.priyanshu.Lab11.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
public interface UserRepository extends JpaRepository<User, Integer> {
    List<User> findByFirstName(String firstName);
    List<User> findByLastName(String lastName);
}
