public class interclass2 {
    public static void main(String[] args) {
        Outer2 outer2 = new Outer2();
        outer2.m();
    }
}
class Outer2 {
    private int n1 = 20;

    private void n2() {
        System.out.println("n2");
    }
    public void m() {
        final class Inter2 {
            public int n1 = 900;
            public void n() {
                System.out.println("n1 = " + n1 + "外部类n1=" + Outer2.this.n1);
                n2();
            }
        }
        Inter2 inter2 = new Inter2();
        inter2.n();
    }
}