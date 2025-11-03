public class String3 {
    public static void main(String[] args) {
        String a = "mdl";
        String b = new String("mdl");
        System.out.println(a.equals(b));
        System.out.println(a == b);
        System.out.println(a == b.intern());
        System.out.println(b == b.intern());

    }
}
