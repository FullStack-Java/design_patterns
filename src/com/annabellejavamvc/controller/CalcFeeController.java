package com.annabellejavamvc.controller;

import com.annabellejavamvc.model.CalcFeesModel;
import com.annabellejavamvc.view.CalcFeeView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

public class CalcFeeController {
    private final CalcFeeView theView;
    private final CalcFeesModel theModel;

    public CalcFeeController(CalcFeeView theView, CalcFeesModel theModel) {
        this.theView = theView;
        this.theModel = theModel;

        this.theView.addSubmitBtnListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DecimalFormat ftmPounds = new DecimalFormat("$###,##0.00");
                String name = theView.getTxtFamilyName();
                boolean isHome = theView.isHomeStudentSelected();
                int courses = Integer.parseInt(theView.getTxtNoOfCourses());

                theModel.setName(name);
                theModel.setHome(isHome);
                theModel.setCourses(courses);

                String money = ftmPounds.format(theModel.calcFees());
                theView.setTxtFees(money);

            }
        });

        this.theView.addClearBtnListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                theView.setTxtFamilyName();
                theView.setTxtNoOfCourses();
                theView.setEmptyTxtFees();
            }
        });
    }
}
