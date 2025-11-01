public class exception1 {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 0;
        try {
            int res = num1 / num2;
        } catch (Exception e) {
            System.out.println("程序出现异常的原因是" + e.getMessage());;
        }
        System.out.println("程序继续运行....");
    }
}
