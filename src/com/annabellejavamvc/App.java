package com.annabellejavamvc;

import com.annabellejava.model.Model;
import com.annabellejava.view.View;

import javax.swing.*;

public class App {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable(){

            @Override
            public void run() {

            }
        });
    }

    public static void runApplication(){
        Model model = new Model();
        View view = new View(model);


    }

}
