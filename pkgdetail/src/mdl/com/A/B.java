package A;
public class B {
    public int n1 = 100;
    protected int n2 = 200;
    int n3 = 300;
    private int n4 = 400;

    public void m() {
        System.out.println("n1=" + n1 + "n2 =" + n2 + "n3=" + n3 + "n4=" + n4);
    }
    //四种修饰符既可以修饰属性又可以修饰方法
    public void m2() {
    }

    void m3() {
    }

    private void m4() {
    }
    protected  void m5(){

    }
}