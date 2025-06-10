package com.signin.signin.views;

import java.lang.classfile.Label;

import org.springframework.beans.factory.annotation.Autowired;

import com.signin.signin.controllers.UserController;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.formlayout.FormLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.EmailField;
import com.vaadin.flow.component.textfield.PasswordField;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.BeforeEnterEvent;
import com.vaadin.flow.router.BeforeEnterObserver;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;



@Route("/signup")
public class SignInView extends VerticalLayout{

    @Autowired
    private UserController controller;

    // components
    private TextField firstName;
    private TextField lastName;
    private  EmailField emailField; 
    private PasswordField passwordField;
    private PasswordField conField;
    private Button submiButton;
    private FormLayout formLayout;


    public SignInView(UserController controller){
        this.controller = controller;

         firstName = new TextField();
         lastName = new TextField();
         emailField = new EmailField();
         passwordField = new PasswordField();
         conField = new PasswordField();
         submiButton = new Button();

         submiButton.addClickListener(e-> handleSubmit());



        formLayout = new FormLayout();
        formLayout.add(firstName,lastName, emailField,passwordField, conField);

        add(formLayout);
         
    }

    public void handleSubmit(){
        String name = firstName.getValue();
        String SecondName = lastName.getValue();
        String email = emailField.getValue();
        String pass1 = passwordField.getValue();
        String pass = conField.getValue();
        
    }

}