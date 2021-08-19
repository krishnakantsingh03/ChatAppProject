package com.example.hello.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FormController {
    @Autowired
    EmployeeRepo repo;
    @RequestMapping("/")
    public String loginPage(){
        return "login";
    }

    @RequestMapping("/details")
    public String setdetails(Employee employee){
         repo.save(employee);
         return "login";
    }

    @RequestMapping("/getdetails")
    public String getdetails(){
        return "details";
    }

    /*
    @PostMapping("/details")
    public String details(@RequestParam("emp_id") String emp_id,
                          @RequestParam("emp_name") String emp_name,
                          @RequestParam("emp_email") String emp_email,
                          ModelMap modelMap)
    {
            modelMap.put("emp_id", emp_id);
            modelMap.put("emp_name", emp_name);
            modelMap.put("emp_email", emp_email);
            return "details";
    }*/
}
