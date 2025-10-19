package com.exercise11;

public class Teacher extends Person{
    private int workage;

    public Teacher(String name, char gender, int age, int workage) {
        super(name,gender,age);
        this.workage = workage;
    }
    public int getWorkage() {
        return workage;
    }

    public void setWorkage(int workage) {
        this.workage = workage;
    }
    public void teach(){
        System.out.println("teaching");
    }
    public String play(){
        return super.play() + "象棋";
    }
    public void showinfo(){
        System.out.println("老师的信息：");
        System.out.println(super.baseinfo());
        System.out.println("workage:" + workage);
        this.teach();
        System.out.println(this.play());
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "workage=" + workage +
                '}' + super.toString();
    }
}
