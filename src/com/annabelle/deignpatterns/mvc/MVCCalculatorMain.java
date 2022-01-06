package com.annabelle.deignpatterns.mvc;

import com.annabelle.deignpatterns.mvc.controller.CalculatorController;
import com.annabelle.deignpatterns.mvc.model.CalculatorModel;
import com.annabelle.deignpatterns.mvc.view.CalculatorView;

import javax.swing.*;

public class MVCCalculatorMain {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                runApp();
            }
        });
    }

    public static void runApp() {
        CalculatorModel model = new CalculatorModel();
        CalculatorView view = new CalculatorView();

        CalculatorController calculatorController = new CalculatorController(model,view);


    }
}
