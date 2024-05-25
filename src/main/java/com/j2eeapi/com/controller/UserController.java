package com.j2eeapi.com.controller;


import com.j2eeapi.com.dto.CreateUserDto;
import com.j2eeapi.com.dto.UpdateUserDto;
import com.j2eeapi.com.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.j2eeapi.com.service.UserService;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/users")
    public ResponseEntity<List<User>> findAllUsers(){
        try{
            return userService.findAllUsers();
        }catch (RuntimeException e){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/users/{idUser}")
    public ResponseEntity<User> findUserById(@PathVariable Long idUser){
        try{
            return userService.findUserById(idUser);
        }catch(RuntimeException e){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping("/users/{idUser}")
    public ResponseEntity<User> updateUser(@PathVariable Long idUser, @RequestBody UpdateUserDto updateUserDto){
        try{
            return userService.updateUser(idUser, updateUserDto);
        }catch(RuntimeException e){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping("/users")
    public ResponseEntity<User> createUser(@RequestBody CreateUserDto createUserDto){
        try{
            return userService.createUser(createUserDto);
        }catch(RuntimeException e){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @DeleteMapping("/users/{idUser}")
    public ResponseEntity<HttpStatus> deleteUser(@PathVariable Long idUser){
        return userService.deleteUser(idUser);
    }


}
