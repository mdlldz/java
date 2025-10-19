package com.exercise10;

public class test {
    public static void main(String[] args) {
        Person p = new Student();
        p.run();
        p.eat();
        Student s = (Student)p;
        s.run();
        s.study();
        s.eat();
    }
}
