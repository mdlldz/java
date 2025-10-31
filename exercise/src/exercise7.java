import org.omg.CORBA.ShortSeqHelper;

public class exercise7 {
    public static void main(String[] args) {
     Person person = new Person("mdl",new Horse());
        person.common();
        person.passRiver();
        person.common();
        person.passRiver();
        person.passRiver();
        person.passRiver();
    }
}
interface Vehicles{
    void work();
}
class Horse implements Vehicles{
    public void work(){
        System.out.println("骑马");
    }
}
class Boat implements Vehicles{
    public void work(){
        System.out.println("坐船");
    }
}
class VehiclesFactory{
    private static Horse horse = new Horse();
    public static Horse getHorse(){
        return horse;
    }
    public static Boat getBoat(){
        return new Boat();
    }
}
class Person{
 private String name;
 private Vehicles vehicles;

    public Person(String name, Vehicles vehicles) {
        this.name = name;
        this.vehicles = vehicles;
    }
    public void passRiver(){
        if(!(vehicles instanceof Boat)){
            vehicles = VehiclesFactory.getBoat();
        }
        vehicles.work();
    }
    public void common(){
        if(!(vehicles instanceof Horse)){
            vehicles = VehiclesFactory.getHorse();
        }
        vehicles.work();
    }
}