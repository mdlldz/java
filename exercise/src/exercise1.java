
public class exercise1 {
    public exercise1() {
        Inner s1 = new Inner();
        s1.a = 10;
        Inner s2 = new Inner();
        System.out.println(s2.a);
    }

    class Inner {
        public int a = 5;
    }

    public static void main(String[] args) {
        exercise1 t = new exercise1();
        Inner r = t.new Inner();
        System.out.println(r.a);
    }
}
