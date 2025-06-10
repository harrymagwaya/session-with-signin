package com.signin.signin.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import com.signin.signin.models.User;

public class UserRepository {
    private JdbcTemplate jdbc;

    @Autowired
    public UserRepository(JdbcTemplate jdbc){
        this.jdbc = jdbc;
    }

    
    public Iterable<User> findAll(){
        return jdbc.query("Select id, name from Users", this:: mapRowToUser);
    }

    private User mapRowToUser(ResultSet rs, int row)throws SQLException{
        return new User(
            rs.getInt("id"), 
            rs.getString("name"));
    }
    
}