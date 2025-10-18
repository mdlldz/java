package com.exercise4;

public class Emplyee {
    private String name;
    private double sal;
    private int salMoth = 12;

    public Emplyee(double sal, String name) {
        this.sal = sal;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    public int getSalMoth() {
        return salMoth;
    }

    public void setSalMoth(int salMoth) {
        this.salMoth = salMoth;
    }
    public void showsal(){
        System.out.println(name + "年工资=" + (sal * salMoth));
    }
}
