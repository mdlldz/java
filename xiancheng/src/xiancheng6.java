public class xiancheng6 {
    public static void main(String[] args) throws InterruptedException {
        F f = new F();
        f.setDaemon(true);
        f.start();
        for (int i = 1; i < 10; i++) {
            System.out.println("ldz");
            Thread.sleep(1000);
        }
    }
}
class F extends Thread{
    public void run(){
        for(;;){
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){}
            System.out.println("mdl");
        }
    }
}