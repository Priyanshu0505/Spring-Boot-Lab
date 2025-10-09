package com.priyanshu.Lab10.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.priyanshu.Lab10.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> { }
