package com.signin.signin.views;

import com.vaadin.flow.component.login.LoginForm;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route("/login")
public class LogInView extends VerticalLayout{
        private  LoginForm loginForm;

    public LogInView(){
        loginForm = new LoginForm();
        add(loginForm);
    }
    
}
