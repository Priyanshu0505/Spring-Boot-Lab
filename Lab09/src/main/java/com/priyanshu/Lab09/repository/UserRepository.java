package com.priyanshu.Lab09.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.priyanshu.Lab09.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> { }
