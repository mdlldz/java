package com.exercise12;

public class B extends A{
    public B(){
        System.out.println("我是B类的无参构造");
    }
    public B(String name){
        System.out.println(name+"我是B类的有参构造");
    }
}
