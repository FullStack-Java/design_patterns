package com.annabellejavamvc.model;

public class CalcFees {
    private String name;
    private boolean home;
    private int courses;

    public CalcFees(String name, boolean home, int courses) {
        this.name = setName(name);
        this.home = home;
        this.courses = setCourses(courses);
    }

    public String setName(String name) {
        name = name.toLowerCase();
        name = name.substring(0,1).toUpperCase() + name.substring(1);
        return name;
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
