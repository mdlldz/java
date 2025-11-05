public class String8 {
    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "Hello";
        System.out.println(str1.equals(str2));


        String username = "johN";
        if ("john".equalsIgnoreCase(username)) {
            System.out.println("Success!");
        } else {
            System.out.println("Failure!");
        }
        System.out.println("mdl".length());
        String a = "mdlldz";
        int indesx = a.indexOf('m');
        int indesx0 = a.indexOf("mdl");
        System.out.println(indesx);
        System.out.println(indesx0);
        System.out.println(a.substring(2));
        System.out.println(a.substring(0,5));
      }
}
