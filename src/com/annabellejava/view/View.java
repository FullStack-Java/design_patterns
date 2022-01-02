package com.annabellejava.view;

import com.annabellejava.controller.Controller;
import com.annabellejava.model.Model;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class View extends JFrame implements ActionListener {
    private Model model;
    private JButton btn;
    private JTextField nameField;
    private JPasswordField passwordField;
    private LoginListener loginListener;

    public View(Model model) throws HeadlessException {

        super("MVC Demo");
        this.model = model;

        nameField = new JTextField(10);
        passwordField = new JPasswordField(10);
        btn = new JButton("OK");

        setLayout(new GridBagLayout());

        GridBagConstraints gc = new GridBagConstraints();
        gc.anchor = GridBagConstraints.LAST_LINE_END;
//        gc.gridheight = 0;
//        gc.gridwidth = 0;
        gc.gridx = 1;
        gc.gridy = 1;
        gc.weightx = 1;
        gc.weighty = 1;
        gc.insets = new Insets(100,0,0,10);
        gc.fill = GridBagConstraints.NONE;

        add(new JLabel("Name: "),gc);

        gc.anchor = GridBagConstraints.LAST_LINE_START;
        gc.gridx = 2;
        gc.gridy = 1;
        gc.weightx = 1;
        gc.weighty = 1;
        gc.insets = new Insets(100,0,0,10);
        gc.fill = GridBagConstraints.NONE;

        add(nameField,gc);

        gc.anchor = GridBagConstraints.LINE_END;
        gc.gridx = 1;
        gc.gridy = 2;
        gc.weightx = 1;
        gc.weighty = 1;
        gc.insets = new Insets(0,0,0,10);
        gc.fill = GridBagConstraints.NONE;

        add(new JLabel("Password: "),gc);

        gc.anchor = GridBagConstraints.LINE_START;
        gc.gridx = 2;
        gc.gridy = 2;
        gc.weightx = 1;
        gc.weighty = 1;
        gc.insets = new Insets(0,0,0,0);
        gc.fill = GridBagConstraints.NONE;

        add(passwordField,gc);

        gc.anchor = GridBagConstraints.FIRST_LINE_START;
        gc.gridx = 2;
        gc.gridy = 3;
        gc.weightx = 1;
        gc.weighty = 1;
        gc.fill = GridBagConstraints.NONE;

        add(btn,gc);

        btn.addActionListener(this);

        setSize(600, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String password = new String(passwordField.getPassword());
        String name = nameField.getText();

        fireEventListener(new LoginFormEvent(name,password));
    }

    public void setLoginListener(LoginListener loginListener) {
        this.loginListener = loginListener;
    }

    public void fireEventListener(LoginFormEvent event){
        if (loginListener != null){
            loginListener.loginPerformed(event);
        }
    }
}
