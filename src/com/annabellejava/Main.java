package com.annabellejava;

import com.annabellejava.controller.Controller;
import com.annabellejava.model.Model;
import com.annabellejava.view.View;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                runApp();
            }
        });
    }

    public static void runApp(){
        Model model = new Model();
        View view = new View(model);

        Controller controller = new Controller(model,view);
    }
}