package com.example.hello.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class CoursesCheck {

    @RequestMapping("/")
    public String hello(){
        return "home";
    }

    @RequestMapping("/demo")
    public String demo(){
        return "Demo";
    }

    @RequestMapping("/course")
    public ModelAndView courses(@RequestParam("cname")String cname){

         ModelAndView mv = new ModelAndView();
         mv.addObject("cname", cname);
         mv.setViewName("course");
         return mv;
    }
}
