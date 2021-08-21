package com.example.hello.view;

import com.example.hello.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FormController {
    @Autowired
    EmployeeRepo repo;

    @RequestMapping("/")
    public String loginPage(){
        return "login";
    }

    @RequestMapping("/login")
    public String details(Employee employee){
        repo.save(employee);
        return "login";
    }

    @RequestMapping("/signup")
    public String signup() {
        return "signup";
    }

    @RequestMapping("/getdetails")
    public String getdetails(){
        return "details";
    }


    @PostMapping("/getdetails")
    public ModelAndView details(@RequestParam String username)
    {
        ModelAndView mv = new ModelAndView("retrieve");
        Employee employee = repo.findById(username).orElse(null);
        mv.addObject(employee);
        return mv;
    }
}
