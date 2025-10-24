package interface6;

public class Test {
    public static void main(String[] args) {
        IF if1 = new Monster();
        if1 = new Car();
        AAA a = new BBB();
        a = new CCC();
    }
}
interface IF{};
class Monster implements IF{}
class Car implements IF{}
class AAA{};
class BBB extends AAA{}
class CCC extends BBB{}
