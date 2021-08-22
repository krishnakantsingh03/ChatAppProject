package com.example.hello.view;

import com.example.hello.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FormController {
    @Autowired
    EmployeeRepo repo;

    @RequestMapping("/")
    public String loginPage(){
        return "login";
    }


    @RequestMapping("/signup")
    public String signup() {
        return "signup";
    }


    @RequestMapping("/forgetpassword")
    public String forgetpassword(){
        return "forgetpassword";
    }

}
