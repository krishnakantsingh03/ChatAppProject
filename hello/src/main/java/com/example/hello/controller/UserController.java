package com.example.hello.controller;

import java.util.Random;

import com.example.hello.dto.UserDTO;
import com.example.hello.model.User;
import com.example.hello.repository.UserRepo;
import com.example.hello.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @Autowired
    Environment env;

    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public void test() {
        System.out.println(env.getProperty("spring.chat.username"));
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public ResponseEntity login(@RequestBody UserDTO user) throws InterruptedException {
        if (userService.isValidUser(user)) {
            return new ResponseEntity<>(HttpStatus.OK);
        }

        return new ResponseEntity<>(HttpStatus.UNAUTHORIZED);
    }

    @RequestMapping(value = "/signup", method = RequestMethod.POST)
    public ResponseEntity registerUser(@RequestBody UserDTO userParam) throws Exception {
        User user = new User();

        user.setUsername(userParam.getUsername());
        user.setEmail(userParam.getEmail());
        user.setPassword(userParam.getPassword());

        if (!userService.isAccountExist(userParam)) {
            userService.saveUser(user);
            return new ResponseEntity<>(HttpStatus.OK);
        }

        return new ResponseEntity<>(HttpStatus.NOT_FOUND);

    }

    @RequestMapping(value = "/sendotp", method = RequestMethod.POST)
    public ResponseEntity sendotp(@RequestBody UserDTO userParam) throws InterruptedException {
        System.out.println(">>>>>>>>>" + userParam.getEmail());
        User user = new User();

        user.setEmail(userParam.getEmail());

        if (userService.isValidEmail(user)) {
            userService.optGenerator(user);
            return new ResponseEntity<>(HttpStatus.OK);
        }

        return new ResponseEntity<>(HttpStatus.UNAUTHORIZED);
    }

    @RequestMapping(value = "/checkotp", method = RequestMethod.POST)
    public ResponseEntity checkotp(@RequestBody UserDTO userParam) throws Exception {
        System.out.println(">>>>>>>>>>>>" + userParam.getOtp());

        return new ResponseEntity<>(HttpStatus.UNAUTHORIZED);
    }
}
