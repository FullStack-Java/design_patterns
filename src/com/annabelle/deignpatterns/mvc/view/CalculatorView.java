package com.annabelle.deignpatterns.mvc.view;

import com.annabelle.deignpatterns.mvc.model.CalculatorModel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class CalculatorView extends JFrame {

    private JTextField firstNumber;
    private JLabel additionLabel;
    private JTextField secondNumber;
    private JButton calculatebutton;
    private JTextField calcSolution;

    public CalculatorView() throws HeadlessException {
        firstNumber = new JTextField(10);
        additionLabel = new JLabel("+");
        secondNumber = new JTextField(10);
        calculatebutton = new JButton("Addition");
        calcSolution = new JTextField(10);

        JPanel calcPanel = new JPanel();

        calcPanel.add(firstNumber);
        calcPanel.add(additionLabel);
        calcPanel.add(secondNumber);
        calcPanel.add(calculatebutton);
        calcPanel.add(calcSolution);

        this.add(calcPanel);
        this.setSize(600, 500);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public int getFirstNumber(){
        return Integer.parseInt(firstNumber.getText());
    }

    public int getSecondNumber(){
        return Integer.parseInt(secondNumber.getText());
    }

    public int getCalcSolution(){
        return Integer.parseInt(calcSolution.getText());
    }

    public void setCalcSolution(int solution){
        calcSolution.setText(Integer.toString(solution));
    }

//    If the calculateButton is clicked execute a method
//    in the Controller named actionPerformed

    public void addCalculateListener(ActionListener listenForCalcButton){
        calculatebutton.addActionListener(listenForCalcButton);
    }

        // Open a popup that contains the error message passed
    public void displayErrorMessage(String errorMessage){
        JOptionPane.showMessageDialog(this, errorMessage);
    }
}
