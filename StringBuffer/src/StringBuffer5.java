import java.util.Scanner;

public class StringBuffer5 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println();
        System.out.println("请输入价格");
        String s = myScanner.next();
        StringBuffer sb = new StringBuffer(s);
        for(int i = s.lastIndexOf(".") - 3;i > 0 ; i -=3 ){
          sb = sb.insert(i ,  ',');
        }
        System.out.println(sb);
    }
}
