package com.example.hello.repository;

import com.example.hello.model.User;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<User, String> {
    // @Query("SELECT email, username, password FROM users WHERE email = :email")
    // User findByEmail(@Param("email") String email);

    // @Query("SELECT u.email, u.username, u.password FROM users u WHERE u.email =
    // ?1")
    // User findByEmail(String email);

}
