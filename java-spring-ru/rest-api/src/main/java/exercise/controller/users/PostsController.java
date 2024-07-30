package exercise.controller.users;

import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;

import exercise.model.Post;
import exercise.Data;

// BEGIN
@RestController
@RequestMapping("/api")
public class UserController {

    private static final List<Post> posts = new ArrayList<>();

    @GetMapping("/users/{id}/posts")
    public List<Post> getUserPosts(@PathVariable String id) {
        var parsedId = Integer.parseInt(id);
        return posts.stream().filter(p -> p.getUserId() == parsedId).toList();
    }

    @PostMapping("/users/{id}/posts")
    @ResponseStatus(HttpStatus.CREATED)
    public void createPost(@PathVariable String id, @RequestBody Post post) {
        post.setUserId(Integer.parseInt(id));
        posts.add(post);
        return post; 
    }
}
// END
