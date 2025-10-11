package polydetail;

public class polydetail1 {
    public static void main(String[] args){
        Base base = new Sub();
        System.out.println(base.count);
        Sub sub = new Sub();
        System.out.println(sub.count);
    }
}
class Base{
    int count = 10;
}
class Sub extends Base{
    int count = 20;
}