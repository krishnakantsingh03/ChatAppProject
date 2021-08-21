package com.example.hello.controller;

import com.example.hello.dto.UserDTO;
import com.example.hello.repository.EmployeeRepo;
import com.example.hello.view.Employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    EmployeeRepo employeeRepo;

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(@RequestBody UserDTO user) {
        System.out.println("USER "+user.getUsername());

        Employee emp = new Employee();
        emp.setUsername(user.getUsername());
        emp.setPassword(user.getPassword());

        employeeRepo.save(emp);

        return "Data stored successfully";
    }
}
