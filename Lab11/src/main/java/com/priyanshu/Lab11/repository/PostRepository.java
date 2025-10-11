package com.priyanshu.Lab11.repository;
import com.priyanshu.Lab11.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import java.time.LocalDate;
import java.util.List;
public interface PostRepository extends JpaRepository<Post, Integer> {
    List<Post> findByDate(LocalDate date);
}
