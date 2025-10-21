public class final3 {
    public static void main(String[] args) {
        AAA aaa = new AAA();
        System.out.println(aaa.n);
    }
}
 class AAA{
    public final static  int n = 1000;
     static {
         System.out.println("静态代码块被调用");
     }
 }
