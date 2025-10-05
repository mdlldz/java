import java.sql.SQLOutput;
import java.util.Scanner;

public class homework2 {
        public static void main(String [] args){
            String [] zu = {"Tom", "mdl", "ldz","jack"};
            Scanner myscanner = new Scanner(System.in);
            System.out.println("输入想查找的字符");
            String findword = myscanner.next();
            A02 a = new A02();
            System.out.println("索引下标为" + a.find(zu,findword));
        }
}
class A02{
    public int find(String[] zu,String findword) {
        for (int i = 0; i < zu.length; i++) {
            if (zu[i].equals(findword)) {
                return i;
            }
        }
        return -1;
    }
}
