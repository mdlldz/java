import java.util.Random;
import java.util.Scanner;
public class Homework01 {
    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
            Random random = new Random();
            while (true) {
                int num = random.nextInt(100);
                System.out.println("随机数：" + num);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        Thread thread2 = new Thread(() -> {
            Scanner scanner = new Scanner(System.in);
            while (true) {
                String input = scanner.nextLine().trim().toUpperCase();
                if ("Q".equals(input)) {
                    System.out.println("已输入Q，程序终止");
                    System.exit(0);
                }
            }
        });

        thread1.start();
        thread2.start();
    }
}