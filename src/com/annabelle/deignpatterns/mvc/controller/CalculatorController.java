package com.annabelle.deignpatterns.mvc.controller;

import com.annabelle.deignpatterns.mvc.model.CalculatorModel;
import com.annabelle.deignpatterns.mvc.view.CalculatorView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorController {

    private static CalculatorView calculatorView;
    private static CalculatorModel calculatorModel;

    public CalculatorController(CalculatorModel model, CalculatorView view) {
        calculatorView = view;
        calculatorModel = model;

        calculatorView.addCalculateListener(new CalculateListener());
    }

    static class CalculateListener implements ActionListener{


        @Override
        public void actionPerformed(ActionEvent e) {
            int firstNumber,secondNumber = 0;

            try{
                firstNumber = calculatorView.getFirstNumber();
                secondNumber = calculatorView.getSecondNumber();

                calculatorModel.addTwoNumbers(firstNumber,secondNumber);
                calculatorView.setCalcSolution(calculatorModel.getCalculationValue());
            }catch (NumberFormatException exception){
                calculatorView.displayErrorMessage("You need to enter numbers in the fields" + exception);
            }
        }
    }
}
