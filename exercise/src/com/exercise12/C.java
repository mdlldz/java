package com.exercise12;

public class C extends B{
    public C(){
        this("hello");
        System.out.println("我是c类的无参构造");
    }

    public C(String name){
        super("haha");
        System.out.println("我是c类的有参构造");
    }
}
