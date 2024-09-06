package com.example.legend.controller;

import com.example.legend.model.Users;
import com.example.legend.service.Userservice;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    Userservice userservice;

    public static final Logger LOGGER = LoggerFactory.getLogger(UserController.class);

    @GetMapping("/users")
    public ResponseEntity<List<Users>> getAllUsers (){
        return userservice.getAllUsers();
    }

    @GetMapping("/user/{userId}")
    public ResponseEntity<Optional<Users>> getUser (@PathVariable int userId){
        LOGGER.info("inside getUser");
        return userservice.getUser(userId);
    }

    @PostMapping("/adduser")
    public ResponseEntity<String> addUser(@RequestBody Users user){
        return userservice.addUser(user);
    }


}
