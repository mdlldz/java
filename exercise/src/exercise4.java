public class exercise4 {
    public static void main(String[] args) {
        String  str = "mdlMDlLDZ55555.";
        D.d(str);
    }
}
class D{
   public static void d(String str){
       if(str == null){
           System.out.println("str不能为空");
           return;
       }
       int a = 0;
       int b = 0;
       int c = 0;
       int d = 0;
       for (int i = 0; i < str.length(); i++) {
           if(str.charAt(i) >= '0' && str.charAt(i) <= '9'){
               a++;
           } else if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
              b++;
           } else if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
              c++;
           } else {
               d++;
           }
       }
       System.out.println("数字有" + a);
       System.out.println("小写字母有" + b);
       System.out.println("大写字母有" + c);
       System.out.println("其他字符有" + d);
   }

}
