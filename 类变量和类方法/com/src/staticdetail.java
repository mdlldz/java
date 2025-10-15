import java.util.concurrent.Callable;

public class staticdetail {
    public static void main(String[] args) {
        C c1 = new C("jack");
        c1.payfee(100);
        C c2 = new C("tom");
        c2.payfee(200);
        C c3 = new C("mdl");
        c3.payfee(300);
        C.showfee();
    }
}
class C {
    String name;
    public static double fee = 0;

    public C(String name) {
        this.name = name;
    }

    public static void payfee(double fee) {
        C.fee += fee;
    }

    public static void showfee() {
        System.out.println("学费一共缴纳" + C.fee);
    }
}
