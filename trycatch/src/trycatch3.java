public class trycatch3 {
    public static void main(String[] args) {
        try {
            int n1 = 1;
            int n2 = 0;
            int res = n1 / n2;
        } finally {
            System.out.println("finally被执行");
        }
        System.out.println("程序继续执行");
    }
}
