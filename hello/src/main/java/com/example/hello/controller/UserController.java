package com.example.hello.controller;

import com.example.hello.dto.UserDTO;
import com.example.hello.repository.UserRepo;

import com.example.hello.view.User;
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
}
