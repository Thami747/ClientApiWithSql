package com.thamiprojects.clientapi.service;

import com.thamiprojects.clientapi.model.User;

import java.util.List;
public interface UserService {

    // Save operation
    User saveUser(User user);

    // Read operation
    List<User> fetchUser();

    // Update operation
    User updateUser(User user, Long departmentId);

    // Delete operation
    void deleteUser(Long userId);
}
