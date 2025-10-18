package com.exercise4;

public class Worker extends Emplyee {
    public Worker(double sal, String name) {
        super(sal, name);
    }
    public void showsal(){
        System.out.print("工人");
        super.showsal();
    }
}
