package com.signin.signin.controllers;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import com.signin.signin.models.User;
import com.signin.signin.repository.UserRepository;
import com.signin.signin.views.LogInView;
import com.signin.signin.views.NewUsers;
import com.signin.signin.views.SignInView;
import com.signin.signin.views.UserProtectedView;
import com.vaadin.flow.router.Router;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@Component
public class UserController {


    @Autowired
    private UserRepository userRepository;


    private Router router;

    public UserController(UserRepository userRepository){
        this.userRepository = userRepository;
    }

   
    public void getAllUserz(Model model) {
        System.out.println("getting all users");

       // List <User> users = userRepository.findAll();

       // model.addAttribute("us", users);
        router.navigate(NewUsers.class);
    }

   
    public void addUser(@RequestParam Map<String, String> newuser, HttpServletResponse response) {
        System.out.println("add user");

        String newName = newuser.get("name");
        String newPswd = newuser.get("password");
        int newSize = Integer.parseInt(newuser.get("size"));
       
        response.setStatus(201);
        return "";
    }

    @GetMapping("/login")
    public LogInView getLogIn(Model model, HttpServletRequest request, HttpSession session) {
        User user = (User) session.getAttribute("session_user");
        if (user == null) {
            return logInView;
        }
        else{
            model.addAttribute("user", user);
            return userProtectedView;
        }
    }
    
}
