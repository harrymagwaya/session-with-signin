package com.signin.signin.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.signin.signin.models.User;

public interface UsersRepo extends JpaRepository<User, Integer> {
    List <User> findBySize(int size);

    List 
}
