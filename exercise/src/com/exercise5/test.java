package com.exercise5;

public class test {

}
class Grand {  String name="AA";
    private int age=100;
    public void g1 (){}
}
class Father extends Grand {
    String id = "001";
    private double score;

    public void f1() {
        //super 可以访问哪些成员 (属性和方法)？
        //super.name; super.g1 ();
        // this 可以访问哪些成员？
        // this.id; this.score; this.f1 ();this.name;this.g1 ();
    }

    class Son extends Father {
        String name = "BB";

        public void g1() {
        }

        private void show() {
            //super 可以访问哪些成员 (属性和方法)?
            //super.id;super.f1 ();super.name;super.g1 ();
            // this 可以访问哪些成员？
            // this.name; this.g1 ();this.show ();this.id;this.f1 ();}
        }
    }
}


