public class equals1 {
    public static void main(String [] args){
        A a = new A();
        A b = a;
        A c = b;
        System.out.println(a == b);
        System.out.println(b == c);
        B obej = a;
        System.out.println(obej == c);
        Integer integer1 = new Integer(1000);
        Integer integer2 = new Integer(1000);
        System.out.println(integer1 == integer2);
        System.out.println(integer1.equals(integer2));
        String string1 = new String("mdl");
        String string2 = new String("mdl");
        System.out.println(string1 == string2);
        System.out.println(string1.equals(string2));
    }
}
class B{}
class A extends B{}
