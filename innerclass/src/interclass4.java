public class interclass4 {
    public static void main(String[] args) {
        Outer4 a = new Outer4();
        a.f1();
    }
}
class Outer4{
    private int n1 = 99;
    public void f1(){
        Person p = new Person(){
          public void hi(){
              System.out.println("匿名内部类重写了hi方法");
            }
        };
        p.hi();
        new Person(){
          public  void hi(){
              System.out.println("mdl");
          }
        }.hi();
    }
}
class Person{
    public void hi(){
        System.out.println("Person hi");
    }
}
