public class hashcode {
    public static void main(String[] args){
        A a1 = new A();
        A a2 = new A();
        A a3 = a1;
        System.out.println("a.hashCode=" + a1.hashCode());
        System.out.println("a.hashCode=" + a2.hashCode());
        System.out.println("a.hashCode=" + a3.hashCode());
    }
}
class A{}