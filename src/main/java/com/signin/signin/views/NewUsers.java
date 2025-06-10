package com.signin.signin.views;

import org.springframework.beans.factory.annotation.Autowired;

import com.signin.signin.controllers.UserController;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route("/users/new")
public class NewUsers extends VerticalLayout {

    @Autowired
    private UserController controller;
    public NewUsers(UserController controller){

        this.controller = controller;



    }
    
}
