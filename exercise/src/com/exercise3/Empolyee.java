package com.exercise3;

public class Empolyee {
    private String name;
    private double daysal;
    private int workday;
    private double grade;
public void printsal(){
    System.out.println(name + "工资=" + daysal * workday * grade);
}
    public Empolyee(String name, double daysal, int workday, double grade) {
        this.name = name;
        this.daysal = daysal;
        this.workday = workday;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDaysal() {
        return daysal;
    }

    public void setDaysal(double daysal) {
        this.daysal = daysal;
    }

    public int getWorkday() {
        return workday;
    }

    public void setWorkday(int workday) {
        this.workday = workday;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }
}
