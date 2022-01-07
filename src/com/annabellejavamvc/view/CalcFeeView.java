package com.annabellejavamvc.view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalcFeeView extends JFrame implements ActionListener {
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


        btn = new JButton("Click Me");

        JPanel panel = new JPanel();
        panel.add(btn);
        this.add(panel);

        btn.addActionListener(this);

        this.setSize(600, 500);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Button Clicked");

    }
}
