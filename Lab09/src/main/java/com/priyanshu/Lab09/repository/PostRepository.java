package com.priyanshu.Lab09.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.priyanshu.Lab09.entity.Post;

public interface PostRepository extends JpaRepository<Post, Integer> { }
