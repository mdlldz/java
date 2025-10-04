package A;

public class C {
    public static void main(String[] args) {
        B c = new B();
        //同一个包下，不能访问private
        System.out.println("n1=" + c.n1 + "n2 =" + c.n2 + "n3=" + c.n3);
    }
}     