public class Finalze {
    public static void main(String[] args){
        Car car = new Car("AE86");
        car = null;
        System.gc();
        System.out.println("程序退出了");
    }
}
class Car{
    private String name;

    public Car(String name) {
        this.name = name;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("已销毁汽车" + name);
        System.out.println("释放了资源");
    }
}
