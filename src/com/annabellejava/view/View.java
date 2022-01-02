package com.annabellejava.view;

import com.annabellejava.model.Model;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class View extends JFrame implements ActionListener {
    private Model model;
    private JButton btn;
    private JButton btn2;


    public View(Model model) throws HeadlessException {

        super("MVC Demo");
        this.model = model;

        btn = new JButton("Hello!!!");
        btn2 = new JButton("Bye.");


        setLayout(new GridBagLayout());

        GridBagConstraints gc = new GridBagConstraints();
        gc.anchor = GridBagConstraints.CENTER;
//        gc.gridheight = 0;
//        gc.gridwidth = 0;
        gc.gridx = 1;
        gc.gridy = 1;
        gc.weightx = 1;
        gc.weighty = 1;
        gc.fill = GridBagConstraints.NONE;

        add(btn,gc);

        gc.anchor = GridBagConstraints.CENTER;
        gc.gridx = 1;
        gc.gridy = 2;
        gc.weightx = 1;
        gc.weighty = 1;
        gc.fill = GridBagConstraints.NONE;

        add(btn2,gc);

        btn.addActionListener(this);
        btn2.addActionListener(this);

//        Anonymous Classes
//        this can be done instead of the clas implementing the action listener
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Sorry To See you go so soon!!");
            }
        });

        setSize(600, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton source = (JButton) e.getSource();
        if (source == btn){
            System.out.println("Hello there");
        }else{
            System.out.println("Bye there");
        }
    }
}
