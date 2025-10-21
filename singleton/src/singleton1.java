public class singleton1 {
    public static void main(String[] args) {
        System.out.println(A.showname());
        A c = A.showname();
        System.out.println(c);
        A d = A.showname();
        System.out.println(d);
        System.out.println(c == d);
    }
}
class A{
    private String name;
    private static A a = new A("mdl");
    private A(String name) {
      this.name = name;
    }
    public static A showname(){
        return a;
    }

    @Override
    public String toString() {
        return "A{" +
                "name='" + name + '\'' +
                '}';
    }
}
