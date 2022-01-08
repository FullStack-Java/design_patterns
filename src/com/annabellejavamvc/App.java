package com.annabellejavamvc;



import com.annabellejavamvc.controller.CalcFeeController;
import com.annabellejavamvc.model.CalcFeesModel;
import com.annabellejavamvc.view.CalcFeeView;

import javax.swing.*;

public class App {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable(){

            @Override
            public void run() {
                runApplication();
            }
        });
    }

    public static void runApplication(){
//        https://www.youtube.com/watch?v=Iwwznm9XSME
        CalcFeeView theView = new CalcFeeView();
        CalcFeesModel theModel = new CalcFeesModel();
        CalcFeeController calcFeeController = new CalcFeeController(theView,theModel);
    }

}
