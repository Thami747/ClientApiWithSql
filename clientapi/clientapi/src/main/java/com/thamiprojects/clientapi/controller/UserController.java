package com.thamiprojects.clientapi.controller;

import com.thamiprojects.clientapi.model.User;
import com.thamiprojects.clientapi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/user")
public class UserController {

    private UserService service;

    public UserController(UserService service) {
        this.service = service;
    }

    @PostMapping(value = "/saveUser")
    public User saveUser(User user) {
        System.out.println("CALLING SAVE USER!!!");
        return service.saveUser(user);
    }

}
