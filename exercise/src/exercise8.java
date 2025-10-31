public class exercise8 {
    public static void main(String[] args) {
        CAR car1 = new CAR(22);
        CAR car2 = new CAR(-1);
        car1.getAir().flow();
        car2.getAir().flow();
    }
}
class CAR{
    private int temperature;

    public CAR(int temperature) {
        this.temperature = temperature;
    }

    class Air{
        public void flow(){
            if(temperature > 40){
                System.out.println("开启冷气");
            }
            if(temperature < 0){
                System.out.println("开启暖气");
            }
        }
    }
    public Air getAir(){
        return new Air();
    }
}
