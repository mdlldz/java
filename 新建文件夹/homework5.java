public class homework5 {
        public static void main(String [] args){
            Cale  cale = new Cale(2,0);
            System.out.println("和为"  + cale.sum());
            System.out.println("差为"  + cale.minus());
            System.out.println("积为"  + cale.mul());
            System.out.println("商为"  + cale.div());
        }
}
class Cale {
    double num1;
    double num2;

    public Cale(double num1,double num2) {
        this.num1 = num1;
        this.num2 = num2;

    }
    public double sum(){
        return num1 + num2;
    }
    public double minus(){
        return num1 - num2;
    }
    public double mul(){
        return num1 * num2;
    }
    public double div(){
        if(num2 == 0){
            System.out.println("除数不能为0");
            return 0;
        }
        return num1 / num2;

    }


}
