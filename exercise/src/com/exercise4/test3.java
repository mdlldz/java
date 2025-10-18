package com.exercise4;

import com.Techer;

public class test3 {
    public static void main(String[] args) {
         Worker jack = new Worker(10000 , "jack");
         jack.showsal();
        Teacher smith = new Teacher(2000,"smith");
        smith.setSalMoth(15);
        smith.setClasssal(20);
        smith.setClassday(30);
        smith.showsal();
        Scientist tom = new Scientist(7000,"Tom");
        tom.setSalMoth(24);
        tom.showsal();
    }
}
