package com.example.hello.controller;

import com.example.hello.dto.UserDTO;
import com.example.hello.model.User;
import com.example.hello.repository.UserRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    UserRepo userRepo;

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(@RequestBody UserDTO user) throws InterruptedException {
        System.out.println("USER " + user.getUsername());

        Thread.sleep(5000);

        // User emp = new User();
        // emp.setUsername(user.getUsername());
        // emp.setPassword(user.getPassword());

        // userRepo.save(emp);

        return "Data stored successfully";
    }

    @RequestMapping(value = "/signup", method = RequestMethod.POST)
    public String registerUser(@RequestBody UserDTO userParam) throws InterruptedException {
        User user = new User();

        user.setUsername(userParam.getUsername());
        user.setEmail(userParam.getEmail());
        user.setPassword(userParam.getPassword());

        userRepo.save(user);
        return "Data Stored In Signup";
    }
}
