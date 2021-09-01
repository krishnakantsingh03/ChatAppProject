package com.example.hello.controller;

import com.example.hello.dto.UserDTO;
import com.example.hello.model.User;
import com.example.hello.repository.UserRepo;
import com.example.hello.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    UserRepo userRepo;

    @Autowired
    UserService userService;

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public ResponseEntity login(@RequestBody UserDTO user) throws InterruptedException {
        if (userService.isValidUser(user)) {
            return new ResponseEntity<>(HttpStatus.OK);
        }

        return new ResponseEntity<>(HttpStatus.UNAUTHORIZED);
    }

    @RequestMapping(value = "/signup", method = RequestMethod.POST)
    public ResponseEntity registerUser(@RequestBody UserDTO userParam) throws InterruptedException {
        User user = new User();

        user.setUsername(userParam.getUsername());
        user.setEmail(userParam.getEmail());
        user.setPassword(userParam.getPassword());

        if (!userService.isAccountExist(userParam)) {
            userRepo.save(user);
            return new ResponseEntity<>(HttpStatus.OK);
        }

        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("User Already Registered!!!");

    }

    // @RequestMapping(value = "/sendotp", method = RequestMethod.POST)
    // public Boolean sendotp(@RequestBody ) {

    // return false;
    // }
}
