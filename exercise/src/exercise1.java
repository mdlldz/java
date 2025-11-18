import com.sun.xml.internal.fastinfoset.util.CharArray;

public class exercise1 {
    public static void main(String[] args) {
        String str = "abcdef";
        System.out.println(A.resverse(str,1,4));
        try {
            str = A.resverse(str, 0, 0);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
class A{
    public  static String resverse(String str,int start ,int end ) {
        if (!(str != null && start>= 0 && end > start && end < str.length ())) {
            throw new RuntimeException ("参数不正确");
        }
    char [] chars  = str.toCharArray();
    char temp = ' ';
        for (int i = start ,j = end; i < j; i++,j--) {
            temp = chars[i];
            chars[i] = chars[j];
            chars[j] = chars[i];
        }
        return new String(chars);
    }
}
