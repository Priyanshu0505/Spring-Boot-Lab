package com.priyanshu.Lab11.service;
import com.priyanshu.Lab11.entity.Post;
import com.priyanshu.Lab11.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.time.LocalDate;
import java.util.List;
@Service
public class PostService {
    @Autowired
    private PostRepository postRepository;
    public List<Post> getAllPosts() {
        return postRepository.findAll();
    }
    public Post addPost(Post post) {
        return postRepository.save(post);
    }
    public List<Post> searchByDate(LocalDate date) {
        return postRepository.findByDate(date);
    }
}
