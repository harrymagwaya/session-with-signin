package com.signin.signin.views;

import java.lang.classfile.Label;

import com.signin.signin.controllers.UserController;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.formlayout.FormLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.EmailField;
import com.vaadin.flow.component.textfield.PasswordField;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;



@Route("/signup")
public class SignInView extends VerticalLayout {

    private UserController controller;

    // components
    private TextField firstName;
    private TextField lastName;
    private  EmailField emailField; 
    private PasswordField passwordField;
    private PasswordField conField;
    private FormLayout formLayout;

    public SignInView(UserController controller){
        this.controller = controller;

        TextField firstName = new TextField();
        TextField lastName = new TextField();
        EmailField emailField = new EmailField();
        PasswordField passwordField = new PasswordField();
        PasswordField conField = new PasswordField();

        FormLayout formLayout = new FormLayout();
        formLayout.add(firstName,lastName, emailField,passwordField, conField);

        add(formLayout);
       
        
    }

}
