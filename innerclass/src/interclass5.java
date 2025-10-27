public class interclass5 {
    public static void main(String[] args) {
    Picture.f1(new IB() {
        @Override
        public void show() {
            System.out.println("一幅名画");
        }
    });
    }
}
interface IB{
    void show();
}
class Picture implements IB{
   public void show(){
       System.out.println("一副画");
    }
    public static void f1(IB ib){
       ib.show();
    }
}
