public class xiancheng4 {
    public static void main(String[] args) throws InterruptedException {
        D d = new D();
        d.setName("mdl");
        d.setPriority(Thread.MIN_PRIORITY);
        d.start();
        for (int i = 0; i < 5; i++) {
            Thread.sleep(1000);
            System.out.println("hi");
        }
        d.interrupt();
    }
}
class D extends Thread{
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + i);
            try {
                Thread.sleep(20000);
            } catch (InterruptedException e) {
                System.out.println(Thread.currentThread().getName() + "被interrupt");
            }
        }
    }
}
