public class xiancheng2 {
    public static void main(String[] args) {
        B b = new B();
        Thread thread = new Thread(b);
        thread.start();
    }
}
class B implements Runnable{
    int count = 0;
    @Override
    public void run() {
        while (true) {
            System.out.println("mdl" + count++ + Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if(count == 8){
                break;
            }
        }
    }
}