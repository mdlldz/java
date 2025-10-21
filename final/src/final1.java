public class final1 {
    public static void main(String[] args) {
        E e = new E();
        e.RATE = 0.5;
    }
}
final class A{
}
class B extends A{

}
class C{
    public final void show(){
        System.out.println("0");
    }
}
class D extends C{
    public final void show(){

    }
}
class E{
    public final double RATE = 2.5;
}
class G{
    public void hi(){
        final double NUM = 0.01;
        NUM = 0.9;
        System.out.println(NUM);
    }

}
