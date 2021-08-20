package com.example.hello.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FormController {
    @Autowired
    EmployeeRepo repo;

    @GetMapping("/")
    public String home(){
        return "home";
    }

    @RequestMapping("/login")
    public String loginPage(){
        return "login";
    }

    @RequestMapping("/details")
    public String details(Employee employee){
        repo.save(employee);
        return "login";
    }

    @RequestMapping("/getdetails")
    public String getdetails(){
        return "details";
    }


    @PostMapping("/getdetails")
    public ModelAndView details(@RequestParam Integer emp_id)
    {
        ModelAndView mv = new ModelAndView("retrieve");
        Employee employee = repo.findById(emp_id).orElse(null);
        mv.addObject(employee);
        return mv;
    }
}
