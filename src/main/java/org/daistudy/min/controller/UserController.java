package org.daistudy.min.controller;

import org.daistudy.min.entity.User;
import org.daistudy.min.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/add", method = RequestMethod.PUT)
    public User add(User user){
        userService.save(user);
        return user;
    }
}
