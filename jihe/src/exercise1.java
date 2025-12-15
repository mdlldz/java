import java.util.LinkedHashSet;
import java.util.Objects;

public class exercise1 {
    public static void main(String[] args) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(new Car0("奥拓",1000));
        linkedHashSet.add(new Car0("奥迪",300000));
        linkedHashSet.add(new Car0("法拉利",10000000));
        linkedHashSet.add(new Car0("奥迪",300000));
        linkedHashSet.add(new Car0("保时捷",70000000));
        linkedHashSet.add(new Car0("奥迪",300000));
        System.out.println("linkedHashset = " + linkedHashSet);
    }
}
class Car0{
    private String name;
    private double price;

    public Car0(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car0{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Double.compare(car.price, price) == 0 &&
                Objects.equals(name, car.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }
}
