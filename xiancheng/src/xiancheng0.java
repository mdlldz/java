public class xiancheng0 {
    public static void main(String[] args) {
        T3 t3 = new T3();
        T4 t4 = new T4();
        Thread thread1 = new Thread(t3);
        Thread thread2 = new Thread(t4);

        thread1.start();
        thread2.start();

        System.out.println("main线程继续...");
    }
}
class T3 implements Runnable {
    @Override
    public void run() {
        for (int n = 1; n <= 10; n++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("hello,world " + n);
        }
    }
}

class T4 implements Runnable {
    @Override
    public void run() {
        for (int m = 1; m <= 5; m++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("hi " + m);
        }
    }
}

