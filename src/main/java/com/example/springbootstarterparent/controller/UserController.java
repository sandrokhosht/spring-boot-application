package com.example.springbootstarterparent.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.springbootstarterparent.model.User;
import com.example.springbootstarterparent.repository.UserRepository;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("api/")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/users")
    public List < User > getUsers() {
        return this.userRepository.findAll();
    }


    @PostMapping("/addUser")
    public List<User> addUser(@RequestParam String firstName,
                              @RequestParam String lastName,
                              @RequestParam String email) {
        User user = new User(firstName,lastName,email);
        userRepository.save(user);
        return this.userRepository.findAll();

    }
}
