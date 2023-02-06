package com.thamiprojects.clientapi.service;

import com.thamiprojects.clientapi.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {

    // Save operation
    User saveUser(User user);

    // Read operation
    List<User> fetchUser();

    // Update operation
    User updateUser(User user, Integer departmentId);

    // Delete operation
    void deleteUser(Integer userId);
}
