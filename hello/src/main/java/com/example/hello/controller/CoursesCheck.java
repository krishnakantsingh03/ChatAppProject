package com.example.hello.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class CoursesCheck {

    @RequestMapping("/")
    public String hello(){
        System.out.println("In Home folder");
        return "home";
    }
    @RequestMapping("/course")
    public String courses(){
        System.out.println("Welcome to my courses");
        return "course";
    }
}
