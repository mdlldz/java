package com;

public class Professor extends Techer{
    public Professor(String name, int age, String post, double salary, double grade) {
        super(name, age, post, salary, grade);
    }
    public void introduce(){
        System.out.println("教授消息如下");
        System.out.println();
        super.introduce();
    }
}
