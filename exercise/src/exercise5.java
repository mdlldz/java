public class exercise5 {
    public static void main(String[] args) {
        Cellphone cellphone = new Cellphone();
        cellphone.testwork(new Computer() {
            @Override
            public double work(double n1, double n2) {
                return n1 + n2;
            }
        },4.0,5.0);

    }
}
interface Computer{
    public  double work(double n1, double n2);
}
class Cellphone {
    public void testwork(Computer computer, double n1, double n2) {
        double result = computer.work(n1, n2);
        System.out.println("计算结果 = " + result);
    }
}
