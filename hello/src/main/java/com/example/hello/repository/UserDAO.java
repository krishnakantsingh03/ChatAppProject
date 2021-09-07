package com.example.hello.repository;

import java.util.Random;

import com.example.hello.model.User;
import com.example.hello.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.batch.BatchProperties.Jdbc;
import org.springframework.http.HttpStatus;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserDAO {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void save(User user) throws Exception {
        String insertQuery = String.format("INSERT INTO users (email, password, username) VALUES('%s', '%s', '%s')",
                user.getEmail(), user.getPassword(), user.getUsername());

        System.out.println("[REPOSITORY]::[USERDAO]::[Save]::insertQuery " + insertQuery);
        /**
         * DML - execute INSERT, UPDATE, DELETE
         */
        jdbcTemplate.execute(insertQuery);
    }

    public void update(User user, int otp) {

        String updateQuery = String.format("UPDATE users SET otp = %d where email = '%s'", otp, user.getEmail());
        System.out.println("[REPOSITORY]::[USERDAO]::[Update]::updateQuery " + updateQuery);
        jdbcTemplate.execute(updateQuery);
    }
}
