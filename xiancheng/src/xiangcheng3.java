public class xiangcheng3 {
    public static void main(String[] args) throws InterruptedException {
        C c = new C();
        c.start();
        Thread.sleep(1000 * 10);
        c.setLoop(false);
    }
}
class C extends Thread{
    private boolean loop =  true;

    public void setLoop(boolean loop) {
        this.loop = loop;
    }

    public void run(){
        int num = 0;
   while(loop) {
       try {
           Thread.sleep(1000);
       } catch (InterruptedException e) {
           e.printStackTrace();
       }
       System.out.println("线程运行中" + num++);
   }
  }
}