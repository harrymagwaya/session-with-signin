package com.signin.signin.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import com.google.j2objc.annotations.AutoreleasePool;
import com.signin.signin.models.User;

public class UserRepository {
    private JdbcTemplate jdbc;

    @Autowired
    public UserRepository(JdbcTemplate jdbc){
        this.jdbc = jdbc;
    }

    @Override
    public Iterable<User> findAll(){
        return jdbc.query("Select id, name from Users", );
    }
    
}
