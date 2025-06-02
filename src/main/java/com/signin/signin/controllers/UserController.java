package com.signin.signin.controllers;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import com.signin.signin.repository.UserRepository;
import com.signin.signin.views.SignInView;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@Controller
public class UserController {


    @Autowired
    private UserRepository userRepository;

    private SignInView signInView;

    public UserController(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    @GetMapping("/users/view")
    public SignInView getAllUserz(Model model) {
        System.out.println("getting all users");

        List <User> users = userRepository.findAll();

        model.addAttribute("us", users);
        return signInView;
    }

    @PostMapping("path")
    public String addUser(@RequestParam Map<String, String> newuser, HttpServletResponse response) {
        System.out.println("add user");

        String newName;
        String newPswd;
        int newSize;

        response.setStatus(201);

        
        return "";
    }
}
