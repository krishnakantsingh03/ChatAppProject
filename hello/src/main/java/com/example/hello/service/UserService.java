package com.example.hello.service;

import java.util.Optional;

import com.example.hello.dto.UserDTO;
import com.example.hello.model.User;
import com.example.hello.repository.UserRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserRepo userRepo;

    public boolean isValidUser(UserDTO user) {

        try {
            User userDB = userRepo.getById(user.getEmail());

            return userDB.getPassword().equals(user.getPassword());

        } catch (Exception ex) {
            System.out.println("[ERROR]::[SERVICE]::isValidUser:: " + ex);
            return false;
        }
    }

    public boolean isAccountExist(UserDTO user) {
        Optional<User> userDB = userRepo.findById(user.getEmail());

        if (userDB.isPresent()) {
            return true;
        }

        return false;
    }
}
