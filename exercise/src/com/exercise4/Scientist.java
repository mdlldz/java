package com.exercise4;

public class Scientist extends Emplyee {
    public Scientist(double sal, String name) {
        super(sal, name);
    }
    private double bonus;

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
    public void showsal(){
        System.out.println(getName() + "年工资=" + (getSal()*getSalMoth() + bonus));
    }
}
