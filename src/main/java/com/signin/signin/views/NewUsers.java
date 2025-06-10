package com.signin.signin.views;

import org.springframework.beans.factory.annotation.Autowired;

import com.signin.signin.controllers.UserController;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.BeforeEnterEvent;
import com.vaadin.flow.router.BeforeEnterObserver;
import com.vaadin.flow.router.Route;

@Route("/users")
public class NewUsers extends VerticalLayout implements BeforeEnterObserver{

    @Autowired
    private UserController controller;
    public NewUsers(UserController controller){

        this.controller = controller;

    }
    @Override
    public void beforeEnter(BeforeEnterEvent event) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'beforeEnter'");
    }
    
}
