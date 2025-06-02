package com.signin.signin.views;

import com.signin.signin.controllers.UserController;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;


public class SignInView extends VerticalLayout {

    private UserController controller;

    public SignInView(UserController controller){
        this.controller = controller;
    }

}
