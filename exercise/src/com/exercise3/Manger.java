package com.exercise3;

public class Manger extends Empolyee{
  public double Bonus;
    public Manger(String name, double daysal, int workday, double grade) {
        super(name, daysal, workday, grade);
    }

    public double getBonus() {
        return Bonus;
    }

    public void setBonus(double Bonus) {
        this.Bonus = this.Bonus;
    }
    public void printsal(){
        System.out.println("经理" + getName() + "工资是 = " + (Bonus + getDaysal()*getGrade()*getWorkday()));
    }
}
