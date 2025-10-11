package polydetail;

public class polydetail2 {
    public static void main(String[] args){
        BB bb = new BB();
        System.out.println(bb instanceof BB);
        System.out.println(bb instanceof AA);
        AA aa = new BB();
        System.out.println(aa instanceof BB);
        System.out.println(aa instanceof AA);
        Object object = new Object();
        System.out.println(object instanceof AA);
        String str = "Hello";
        System.out.println(str instanceof Object);
    }
}
class AA{}
class BB extends AA{}
