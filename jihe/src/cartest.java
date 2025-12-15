import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class cartest {
    public static void main(String[] args) {
        Car car = new Car("宝马", 400000);
        Car car2 = new Car("宾利", 5000000);
        Car car3 = new Car("奔驰", 600000);
        Car car4 = new Car("奥迪", 500000);
        ArrayList<Car> carList = new ArrayList<>();
        carList.add(car);
        carList.add(car2);

        carList.remove(car);

        System.out.println(carList.contains(car2));

        System.out.println(carList.size());

        System.out.println(carList.isEmpty());

        List<Car> addList = new ArrayList<>();
        addList.add(car3);
        addList.add(car4);
        carList.addAll(addList);

        System.out.println(carList.containsAll(addList));

        carList.removeAll(addList);

        for (Car c : carList) {
            System.out.println(c);
        }

        Iterator<Car> it = carList.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        carList.clear();
    }
}
class Car {
    public String name;
    public double price;

    public Car(String name, double price) {
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
        return "Car{name='" + name + "', price=" + price + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Double.compare(car.price, price) == 0 && name.equals(car.name);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(name, price);
    }
}
