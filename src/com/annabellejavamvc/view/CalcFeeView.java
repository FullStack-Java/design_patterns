package com.annabellejavamvc.view;

import javax.swing.*;
import java.awt.*;

import java.awt.event.ActionListener;

public class CalcFeeView extends JFrame {
//    https://www.youtube.com/watch?v=Iwwznm9XSME&t=2s
//    @10:18
    JLabel lblFamilyName;
    JTextField txtFamilyName;
    JRadioButton homeStudent;
    JRadioButton overSeasStudent;
    ButtonGroup bpStatus;
    JLabel lblNoCourses;
    JTextField txtNoOfCourses;
    JButton btnSubmit;

    JLabel lblFees;
    JTextField txtFees;
    JButton btnClear;

    public CalcFeeView() throws HeadlessException {

        lblFamilyName = new JLabel("Enter your family name");
        txtFamilyName = new JTextField(10);
        homeStudent = new JRadioButton("Home Student", false);
        overSeasStudent = new JRadioButton("OverSeas Student", true);
        bpStatus = new ButtonGroup();
        lblNoCourses = new JLabel("Enter the number of courses.");
        txtNoOfCourses = new JTextField(10);
        btnSubmit = new JButton("Submit Details");
        lblFees = new JLabel("The fees for the area are: ");
        txtFees = new JTextField(10);
        btnClear = new JButton("Clear Fields");

//        JPanel panel = new JPanel();
//        panel.add(btn);
//        this.add(panel);
//
//        btn.addActionListener(this);
        bpStatus.add(homeStudent);
        bpStatus.add(overSeasStudent);
        this.add(lblFamilyName);
        this.add(txtFamilyName);
        this.add(homeStudent);
        this.add(overSeasStudent);
        this.add(lblNoCourses);
        this.add(txtNoOfCourses);
        this.add(btnSubmit);
        this.add(lblFees);
        this.add(txtFees);
        this.add(btnClear);

//        I'll add the action listeners but in the CalcFeeController of the application using the Functions below

//        Traditional Way of Adding an Action Listener
//        The Class will implement the action listener
//        We will then have to override the action performed method

//        btnSubmit.addActionListener(this);
//
//        btnClear.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//
//
//            }
//        });



        this.setLayout(new FlowLayout());
        this.setTitle("Fee Calculator");
        this.setSize(300, 220);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }

//    @Override
//    public void actionPerformed(ActionEvent e) {
//        System.out.println("This is only added if an instance wasn't created. if an instance wasn't created we would not have have to implement the Action Listener");
//
//        if (e.getSource() == btnSubmit){
//
//        }
//    }


    public String getTxtFamilyName() {
        return txtFamilyName.getText();
    }

    public String getTxtNoOfCourses() {
        return txtNoOfCourses.getText();
    }

    public void setTxtFamilyName() {
        this.txtFamilyName.setText("");
    }

    public void setTxtNoOfCourses() {
        this.txtNoOfCourses.setText("");
    }

    public void setEmptyTxtFees() {
        this.txtFees.setText("");
    }

    public void setTxtFees(String txtFees) {
        this.txtFees.setText(txtFees);
    }

    public boolean isHomeStudentSelected() {
        return homeStudent.isSelected();
    }

    public void addSubmitBtnListener(ActionListener listenForSubmitButton){
        btnSubmit.addActionListener(listenForSubmitButton);
    }

    public void addClearBtnListener(ActionListener listenForClearButton){
        btnClear.addActionListener(listenForClearButton);
    }
}
