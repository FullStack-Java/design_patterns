package com.annabellejava.controller;

import com.annabellejava.model.Model;
import com.annabellejava.view.LoginFormEvent;
import com.annabellejava.view.LoginListener;
import com.annabellejava.view.View;

public class Controller implements LoginListener {
    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    @Override
    public void loginPerformed(LoginFormEvent event) {
        System.out.println("Login event performed" + event.getName() + event.getPassword());
    }
}
