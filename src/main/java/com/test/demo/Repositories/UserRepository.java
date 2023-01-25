package com.test.demo.Repositories;

import com.test.demo.Models.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserRepository extends CrudRepository<User, Long> {
    User findByUsername(String username);
    List<User> findAllByEmailContainsOrUsernameContains(String string, String string2);
    // User findOne(long id);


}
