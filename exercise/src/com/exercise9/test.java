package com.exercise9;

public class test {
    public static void main(String[] args) {
        Doctor doctor1 = new Doctor("jack",20,"牙科医生",'男',20000);
        Doctor doctor2 = new Doctor("jack",20,"牙科医生",'男',20000);
        System.out.println(doctor1.equals(doctor2));
    }
}
