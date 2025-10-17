public class codeblock2 {
    public static void main(String[] args) {
        AA aa = new AA();
        System.out.println(Cat.name);
        Cat cat = new Cat();
        DD d1 = new DD();
        DD d2 = new DD();
        System.out.println(EE.name);
    }
}
class BB{
    static {
        System.out.println("BB的静态代码块被执行");
    }
}
class AA extends BB{
    static {
        System.out.println("AA的静态代码块被执行");
    }
}
class Cat{
    public static String name;
    static{
        System.out.println("cat的静态代码块被调用");
    }
}
class DD{
    static {
        System.out.println("DD的代码块被调用");
    }
    {
        System.out.println("DD的普通代码块被调用" );
    }
}
class EE{
    public static String name;
    {
        System.out.println("EE的普通代码块被调用");
    }
}



