package com.example.hello.view;

import com.example.hello.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FormController {
    @Autowired
    UserRepo repo;

    @RequestMapping("/")
    public String loginPage() {
        return "login";
    }

    @RequestMapping("/forget")
    public String forget() {
        return "forget";
    }

    @RequestMapping("/OTPPage")
    public String OTP() {
        return "OTPPage";
    }
}
