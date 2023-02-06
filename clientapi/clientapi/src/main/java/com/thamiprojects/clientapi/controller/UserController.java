package com.thamiprojects.clientapi.controller;

import com.thamiprojects.clientapi.model.User;
import com.thamiprojects.clientapi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/user", produces = MediaType.APPLICATION_JSON_VALUE)
public class UserController {

    @Autowired(required = false)
    private UserService service;

    @PostMapping(value = "/saveUser")
    public User saveUser(User user) {
        System.out.println("CALLING SAVE USER!!!");
        return service.saveUser(user);
    }

}
