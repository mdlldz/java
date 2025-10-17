public class codeblock4 {
    public static void main(String[] args) {
        BBB bbb = new BBB();
    }
}
class AAA{
    {
        System.out.println("AAA的普通代码块");
    }
    public AAA(){
        System.out.println("AAA的构造器被调用");
    }
}
class  BBB extends AAA{
    {
        System.out.println("BBB的普通代码块");
    }
    public BBB(){
        System.out.println("BBB的构造器被调用");
    }
}

