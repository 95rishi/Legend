package com.example.legend.service;

import com.example.legend.exceptions.ValidationException;
import com.example.legend.model.Users;
import com.example.legend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class Userservice {
    @Autowired
    UserRepository userRepo;
    public ResponseEntity<List<Users>> getAllUsers() {
        List<Users> users = userRepo.findAll();
        return new ResponseEntity<>(users, HttpStatus.OK);
    }

    public ResponseEntity<String> addUser(Users user) {
        userRepo.save(user);
        return new ResponseEntity<>("SUCCESS", HttpStatus.CREATED);

    }

    public ResponseEntity<Optional<Users>> getUser(int userId) {
        Optional<Users> user = userRepo.findById(userId);
        throw new ValidationException("Kuchh nahi bas test kar rhe hn");
        //return new ResponseEntity<>(user, HttpStatus.OK);
    }
}
