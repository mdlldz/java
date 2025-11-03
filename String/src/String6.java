public class String6 {
    public static void main(String[] args) {
        String s1 = "mdl";
        String s2 = "java";
        String s5 = "mdljava";
        String s6 = (s1 + s2).intern();
        System.out.println(s5 == s6);
        System.out.println(s5.equals(s6));
    }
}
