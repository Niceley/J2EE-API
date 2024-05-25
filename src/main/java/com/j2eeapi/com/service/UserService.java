package com.j2eeapi.com.service;

import com.j2eeapi.com.dto.CreateUserDto;
import com.j2eeapi.com.dto.LoginDto;
import com.j2eeapi.com.dto.UpdateUserDto;
import com.j2eeapi.com.model.User;
import com.j2eeapi.com.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository repository;

    public ResponseEntity<List<User>> findAllUsers(){
        try {
            return new ResponseEntity<>(repository.findAll(), HttpStatus.OK);
        }catch(RuntimeException e){
            return new ResponseEntity<>(repository.findAll(), HttpStatus.NOT_FOUND);
        }
    }

    public ResponseEntity<User> login(LoginDto loginDto){
        User user = repository.findById(loginDto.getIdUtilisateur()).orElseThrow(null);
        if (user == null){
            throw new RuntimeException("Utilisateur inexistant.");
        }
        String hashedPassword = hashPassword(loginDto.getMotdepasse());
        if(!user.getMotdepasse().equals(hashedPassword)){
            throw new RuntimeException("Mauvais mot de passe.");
        }
        return new ResponseEntity<>(user, HttpStatus.OK);
    }

    public ResponseEntity<User> findUserById(Long idUser){
        User user = repository.findById(idUser).orElseThrow(() -> new RuntimeException());
        return new ResponseEntity<>(user, HttpStatus.OK);
    }

    public ResponseEntity<User> createUser(CreateUserDto createUserDto){
        //if(repository.findById(createUserDto.getIdUtilisateur()).isPresent()){
        //    throw new RuntimeException("Utilisateur existant");
        //}
        String hashedpassword = hashPassword(createUserDto.getMotdepasse());
        User newUser;
        newUser = new User(
                createUserDto.getIdUtilisateur(),
                hashedpassword,
                createUserDto.getNom(),
                createUserDto.getPrenom(),
                createUserDto.getNumero(),
                createUserDto.getMail(),
                createUserDto.getRoleUtilisateur()
        );
        repository.save(newUser);
        return new ResponseEntity<>(newUser, HttpStatus.CREATED);
    }

    public ResponseEntity<User> updateUser(Long idUser, UpdateUserDto updateUserDto){
        User existingUser = repository.findById(idUser).orElseThrow(() -> new RuntimeException("Utilisateur introuvable"));

        existingUser.setNom(updateUserDto.getNom());
        existingUser.setPrenom(updateUserDto.getPrenom());
        existingUser.setMail(updateUserDto.getMail());
        existingUser.setNumero(updateUserDto.getNumero());
        existingUser.setRoleUtilisateur(updateUserDto.getRoleUtilisateur());
        User updatedUser = repository.save(existingUser);
        return new ResponseEntity<>(updatedUser, HttpStatus.OK);
    }

    public ResponseEntity<HttpStatus> deleteUser(Long idUser){
        repository.deleteById(idUser);
        return new ResponseEntity<>(HttpStatus.OK);
    }




    private String hashPassword(String password) {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            byte[] hash = md.digest(password.getBytes(StandardCharsets.UTF_8));
            BigInteger number = new BigInteger(1, hash);
            StringBuilder hexString = new StringBuilder(number.toString(16));
            while (hexString.length() < 32) {
                hexString.insert(0, '0');
            }
            return hexString.toString();
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }
}
