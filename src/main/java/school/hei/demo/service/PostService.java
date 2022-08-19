package school.hei.demo.service;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import school.hei.demo.model.Post;
import school.hei.demo.repository.PostRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class PostService {
    @Autowired
    private final PostRepository postRepository;

    public List<Post> getPost() {
        return postRepository.findAll();
    }
}
