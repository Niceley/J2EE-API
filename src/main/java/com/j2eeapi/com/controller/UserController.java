package com.j2eeapi.com.controller;


import com.j2eeapi.com.dto.CreateUserDto;
import com.j2eeapi.com.dto.LoginDto;
import com.j2eeapi.com.dto.UpdateUserDto;
import com.j2eeapi.com.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.j2eeapi.com.service.UserService;
import com.j2eeapi.com.service.JwtService;
import com.j2eeapi.com.responses.ResponsesLogin;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private JwtService JwtService;

    public UserController(UserService userService, JwtService JwtService){
        this.userService = userService;
        this.JwtService = JwtService;
    }

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

    @PostMapping("/register")
    public ResponseEntity<User> createUser(@RequestBody CreateUserDto createUserDto){
        return userService.createUser(createUserDto);
    }

    @PostMapping("/login")
    public ResponseEntity<ResponsesLogin> authenticate(@RequestBody LoginDto loginDto){
        User authenticatedUser = userService.login(loginDto).getBody();
        String token = JwtService.generateToken(authenticatedUser);

        ResponsesLogin responsesLogin = new ResponsesLogin();
        responsesLogin.setToken(token);
        responsesLogin.setExpiresIn(86400000);
        return new ResponseEntity<>(responsesLogin, HttpStatus.OK);
    }

    @DeleteMapping("/{idUser}")
    public ResponseEntity<HttpStatus> deleteUser(@PathVariable Long idUser){
        return userService.deleteUser(idUser);
    }


}
