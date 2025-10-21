public class final4 {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        System.out.println("圆的面积=" + circle.claArea());
    }
}
class Circle{
    private final double PI = 3.14;
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }
    public double claArea(){
       return radius * PI;
    }
}
