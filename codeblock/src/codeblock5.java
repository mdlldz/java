public class codeblock5 {
    public static void main(String[] args) {
        G g = new G();
    }
}
class E{
    private static int n0 = getn0();
    static{
        System.out.println("E的静态代码块");
    }
    private int n3 = getn3();
    {
        System.out.println("E的普通代码块");
    }
    public static int getn0(){
        System.out.println("E的静态方法");
        return 0;
    }
    public int getn3(){
        System.out.println("E的普通方法");
        return 3;
    }
    public E(){
        System.out.println("E的构造器");
    }
}
class G extends E{
    private static int n4 = getn4();
    static{
        System.out.println("G的静态代码块");
    }
    private int n5 = getn5();
    {
        System.out.println("G的普通代码块");
    }
    public static int getn4(){
        System.out.println("G的静态方法");
        return 4;
    }
    public int getn5(){
        System.out.println("G的普通方法");
        return 5;
    }
    public G(){
        System.out.println("G的构造器");
    }
}