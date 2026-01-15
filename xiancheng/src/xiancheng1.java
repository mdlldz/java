import java.io.IOException;

public class xiancheng1 {
    public static void main(String[] args) throws InterruptedException {
        A a = new A();
        a.start();
        System.out.println("主线程继续执行" + Thread.currentThread().getName());
        for (int i = 0; i < 10; i++) {
            System.out.println("主线程 i =" + i);
            Thread.sleep(1000);
        }
    }
}
class A extends Thread{
    int times = 0;
    public void run(){
        while (true){
            System.out.println("mdl" + times++ + " 线程名称为 " + Thread.currentThread().getName() );
            try{
            Thread.sleep(1000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
            if(times == 8){
                break;
            }
    }
    }
}
