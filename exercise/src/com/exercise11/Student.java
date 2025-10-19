package com.exercise11;

public class Student extends Person{
    private String stuid;
    public Student(String name, char gender, int age, String stuid) {
        super(name,gender,age);
        this.stuid = stuid;
    }
    public String getStuid() {
        return stuid;
    }

    public void setStuid(String stuid) {
        this.stuid = stuid;
    }
    public void study(){
        System.out.println("studying");
    }
    public String play(){
        return super.play() + "排球";
    }
    public void printinfo(){
        System.out.println("学生的信息：");
        System.out.println(super.baseinfo());
        System.out.println("学号：" + stuid);
        this.study();
        System.out.println(this.play());
    }

    @Override
    public String toString() {
        return "Student{" +
                "stuid='" + stuid + '\'' +
                '}' + super.toString();
    }
}
