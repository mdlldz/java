package com.exercise11;

import com.Techer;

import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        Student student = new Student("小明",'男',15,"5233");
        Teacher teacher = new Teacher("mdl",'女',30,6);
        student.printinfo();
        teacher.showinfo();
        Person[] persons = new Person[4];
        persons[0] = new Student("jack",'男',10,"0001");
        persons[1] = new Student("mary",'女',20,"0002");
        persons[2] = new Teacher("smith",'男',36,5);
        persons[3] = new Teacher("scott",'男',26,1);
        test.sort(persons);
        for (int i = 0; i < persons.length; i++) {
            test.show(persons[i]);
        }
    }
    public static void sort(Person[] persons){
        Person temp = null;
        for (int i = 0; i < persons.length - 1; i++) {
            for (int j = 0; j < persons.length - 1 - i; j++) {
            if(persons[j].getAge() > persons[j + 1].getAge()){
                temp = persons[j + 1];
                persons[j + 1] =persons[j];
                persons[j] =temp;
                }
            }
        }
        for (int i = 0; i < persons.length; i++) {
            System.out.println(persons[i] + "\n");
        }
    }
    public static void show(Person p){
        if(p instanceof Student){
            ((Student) p).study();
        }
        else if(p instanceof Teacher){
            ((Teacher) p).teach();
        }
        else {
            System.out.println("do nothing  ");
        }
    }
}
