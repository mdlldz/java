public class interclass6 {
    public static void main(String[] args) {
        Outer6 b = new Outer6();
        b.t1();
    }
}
class Outer6 {
    private int n1 = 10;
    public String name = "张三";
    class Inner6 {
        public void say() {
            System.out.println("Outer01 的 n1 = " + n1 + " outer01 的 name = " + name);
        }
    }
    public void t1(){
        Inner6 a = new Inner6();
        a.say();
    }
}
