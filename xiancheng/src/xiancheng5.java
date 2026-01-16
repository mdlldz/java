public class xiancheng5 {
    public static void main(String[] args) throws InterruptedException {
        E e = new E();
        e.start();
        for (int i = 0; i < 20; i++) {
            Thread.sleep(1000);
            System.out.println(i + "B");
            if(i == 10){
                System.out.println("被子线程插队");
                e.join();

            }
        }
    }
}
class E extends Thread{
    public void run(){
        for (int i = 0; i < 20; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(i + "A");
        }
    }
}