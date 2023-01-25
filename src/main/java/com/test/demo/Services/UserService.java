package com.test.demo.Services;

// import com.test.demo.Models.Post;
import com.test.demo.Models.User;
// import com.test.demo.Repositories.PostRepository;
import com.test.demo.Repositories.UserRepository;
import org.springframework.security.core.context.SecurityContextHolder;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class UserService {

    private final UserRepository usersRepo;
    // private PostService postService;


    public UserService(UserRepository usersRepo) {
        this.usersRepo = usersRepo;

    }

    public Iterable<User> findAll() {
        return usersRepo.findAll();
    }

    public User save(User user) {
//        post.setId(posts.size() + 1);
//        posts.add(post);
        return usersRepo.save(user);
    }

    public User edit(User user){
        // Iterable<Post> userPosts = postService.userPosts();
        // for(Post post : userPosts){
        //     post.setUser(user);
        //     postService.edit(post);
        // }
        return usersRepo.save(user);
    }

    public void delete(long id){
        User deletedUser = usersRepo.findById(id).get();
        Iterable<User> updatedUsers = usersRepo.findAll();
        for(User currentUser : updatedUsers){
            if (currentUser.getId() == deletedUser.getId()){
                usersRepo.deleteById(currentUser.getId());
            }
        }
    }

    public User findOne(long id) {
        return usersRepo.findById(id).get();
    }

    public List<User> search(String string){
        return usersRepo.findAllByEmailContainsOrUsernameContains(string, string);
    }
}
