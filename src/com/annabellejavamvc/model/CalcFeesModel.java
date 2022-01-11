package com.annabellejavamvc.model;

public class CalcFeesModel {
    private String name = "Empty";
    private boolean home = false;
    private int courses = 0;

    public CalcFeesModel() {

    }

    public String setName(String name) {
        System.out.println(name);
        this.name = name.substring(0,1).toUpperCase() + name.substring(1);
        return this.name;
    }

    public void setHome(boolean home) {
        this.home = home;
    }

    public Integer setCourses(int courses) {
        if (courses < 0) courses = 0;
        return this.courses = courses;
    }

    public double calcFees(){
        final int HOME_FEE = 600;
        final int OVERSEAS_FEE = 2000;

        if ("Wicks".equalsIgnoreCase(name)){
            return 0;
        }else if(home){
            return HOME_FEE * courses;
        }else{
            return OVERSEAS_FEE * courses;
        }
    }
}
