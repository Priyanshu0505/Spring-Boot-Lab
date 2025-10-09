package com.priyanshu.Lab10.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.priyanshu.Lab10.entity.Post;

public interface PostRepository extends JpaRepository<Post, Integer> { }
