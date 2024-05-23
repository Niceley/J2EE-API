package com.j2eeapi.com.controller;


import com.j2eeapi.com.model.User;
import org.springframework.web.bind.annotation.*;
import com.j2eeapi.com.service.UserService;

import java.util.List;

@RestController
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/add-user")
    public User addUser(User user){
        return userService.saveUser(user);
    }
    @GetMapping("/users")
    public List<User> getUsers(){
        return userService.getUsers();
    }

    @GetMapping("/user/{id}")
    public User getUserById(@PathVariable Long id){
        return userService.getUserById(id);
    }

    @DeleteMapping("/delete-user/{id}")
    public String deleteUser(@PathVariable Long id){
        return userService.deleteUser(id);
    }

}
