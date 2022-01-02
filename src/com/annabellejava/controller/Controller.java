package com.annabellejava.controller;

import com.annabellejava.model.Model;
import com.annabellejava.view.View;

public class Controller {
    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }
}
