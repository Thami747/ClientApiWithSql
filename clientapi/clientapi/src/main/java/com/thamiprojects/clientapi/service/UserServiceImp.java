package com.thamiprojects.clientapi.service;

import com.thamiprojects.clientapi.model.User;
import com.thamiprojects.clientapi.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
@Service
public class UserServiceImp implements UserService{

//    @Autowired
    UserRepository userRepository;

    @Autowired
    public UserServiceImp(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User saveUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public List<User> fetchUser() {
        return userRepository.findAll();
    }

    @Override
    public User updateUser(User user, Long userId) {
        User userFromDb = userRepository.findById(userId).get();

        if (Objects.nonNull(user.getFirstName()) && !"".equalsIgnoreCase(user.getFirstName())) {
            userFromDb.setFirstName(user.getFirstName());
        }

        if (Objects.nonNull(user.getLastName()) && !"".equalsIgnoreCase(user.getLastName())) {
            userFromDb.setLastName(user.getLastName());
        }

        if (Objects.nonNull(user.getIdentity()) && !"".equalsIgnoreCase(user.getIdentity())) {
            userFromDb.setIdentity(user.getIdentity());
        }

        if (Objects.nonNull(user.getEmail()) && !"".equalsIgnoreCase(user.getEmail())) {
            userFromDb.setEmail(user.getEmail());
        }

        return userRepository.save(userFromDb);
    }

    @Override
    public void deleteUser(Long userId) {
        userRepository.deleteById(userId);
    }
}
