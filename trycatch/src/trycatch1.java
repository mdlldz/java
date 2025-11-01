public class trycatch1 {
    public static void main(String[] args) {
        try {
            String str = "123";
            int a = Integer.parseInt(str);
            System.out.println("数字：" + a);
        } catch (Exception e) {
            System.out.println("异常信息为" + e.getMessage());
        } finally {
            System.out.println("不管是否发生异常，始终执行的代码~~");
        }

    }
}
