public class final2 {
    public static void main(String[] args) {
        CC cc = new CC();
        EE ee = new EE();
        ee.hi();
    }
}
class AA{
    final  private double TAX_RATE = 0.08;
    final  private double TAX_RATE1;
    final  private double TAX_RATE2;

    public AA() {
        TAX_RATE1 = 2.5;
    }
    {
        TAX_RATE2 = 0.5;
    }
}
class BB{
    final   static private double TAX_RATE = 0.08;
    final  static double TAX_RATE1;
    final  static double TAX_RATE2;
    public BB(){
        TAX_RATE1 = 0.5;
    }
    static {
        TAX_RATE2 = 2.5;
    }
}
final class CC{

}
class DD{
   public final void hi(){
        System.out.println("hello,world");
    }
}
class EE extends DD{

}

