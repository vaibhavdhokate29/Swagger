package com.example.Swagger.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import com.example.Swagger.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
}

