package com.process.shop.controller;

import com.process.shop.model.User;
import com.process.shop.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/user")
public class UserController {
    @Autowired
    private UserService userService;
    @PostMapping
    public User createUser(@RequestBody User user){
        return userService.createUser(user);
    }
    @GetMapping("/all")
    public List<User> findAllUser() {
        return userService.findAllUser();
    }
    @GetMapping("/{id}")
    public User getUserById(@RequestParam Long id){
        return userService.getUserById(id);
    }
}
