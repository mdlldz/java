package interface6;

public class Test0 {
    public static void main(String[] args) {
        Usb [] usbs = new Usb[2];
        usbs[0] = new Phone();
        usbs[1] = new Camera();
        for (int i = 0; i < usbs.length; i++) {
            usbs[i].work();
            if(usbs[i] instanceof Phone){
                ((Phone) usbs[i]).call();
            }
        }
    }
}
interface Usb{
    void work();
}
class Phone implements Usb{
    public void work(){
        System.out.println(" 手机工作中");
    }
    public void call(){
        System.out.println("手机可以打电话");
    }
}
class Camera implements Usb{
    public void work(){
        System.out.println("相机工作中");
    }
}

