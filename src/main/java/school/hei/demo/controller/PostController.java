package school.hei.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import school.hei.demo.model.Post;
import school.hei.demo.service.PostService;

import java.util.List;

@RestController
public class PostController {
    @Autowired
    private PostService postService;

    @GetMapping("/posts")
    public List<Post> getPost() {
        return postService.getPost();
    }
}
