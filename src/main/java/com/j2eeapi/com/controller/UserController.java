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
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserService userService;


    @GetMapping("")
    public ResponseEntity<List<User>> findAllUsers(){
        try{
            return userService.findAllUsers();
        }catch (RuntimeException e){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/{idUser}")
    public ResponseEntity<User> findUserById(@PathVariable Long idUser){
        try{
            return userService.findUserById(idUser);
        }catch(RuntimeException e){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping("/{idUser}")
    public ResponseEntity<User> updateUser(@PathVariable Long idUser, @RequestBody UpdateUserDto updateUserDto){
        try{
            return userService.updateUser(idUser, updateUserDto);
        }catch(RuntimeException e){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping("")
    public ResponseEntity<User> createUser(@RequestBody CreateUserDto createUserDto){
        return userService.createUser(createUserDto);
    }

    @DeleteMapping("/users/{idUser}")
    public ResponseEntity<HttpStatus> deleteUser(@PathVariable Long idUser){
        return userService.deleteUser(idUser);
    }


}
