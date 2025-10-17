public class codeblock3 {
    public static void main(String[] args){
        A a = new A();
    }
}
class A{
    private static int n1= getn1();
    private int n2 = getn2();
    static {
        System.out.println("AA的静态代码块被调用");
    }
    private static int getn1(){
        System.out.println("getn1方法被调用");
        return 200;
    }
    {
        System.out.println("普通代码块被调用");
    }
    private static int getn2(){
        System.out.println("getn2方法被调用");
        return 100;
    }
    public A(){
        System.out.println("构造器最后被调用");
    }
}

