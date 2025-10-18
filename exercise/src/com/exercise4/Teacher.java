package com.exercise4;

import com.exercise3.Empolyee;

public class Teacher extends Emplyee {
    public Teacher(double sal, String name) {
        super(sal, name);
    }

    private int classday;
    private double classsal;

    public int getClassday() {
        return classday;
    }

    public void setClassday(int classday) {
        this.classday = classday;
    }

    public double getClasssal() {
        return classsal;
    }

    public void setClasssal(double classsal) {
        this.classsal = classsal;
    }

    public void showsal() {
        System.out.println(getName() + "年工资=" + ((classday * classsal) + getSal()*getSalMoth()));
    }
}

