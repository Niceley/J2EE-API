package com.j2eeapi.com.service;

import com.j2eeapi.com.model.User;
import com.j2eeapi.com.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private final UserRepository repository;

    @Autowired
    public UserService(UserRepository repository) {
        this.repository = repository;
    }


    public User saveUser(User user){
        return repository.save(user);
    }

    public List<User> getUsers(){
        return repository.findAll();
    }

    public User getUserById(Long id){
        return repository.findById(id).orElse(null);
    }

    public String deleteUser(Long id){
        repository.deleteById(id);
        return "User removed !! "+id;
    }
}
