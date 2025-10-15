public class TestPerson {
    public static void main(String[] args) {
        Person.setTotalPerson(3);
        new Person();
        Person.m();
    }
}
class Person {
    private int id;
    private static int total = 0;
    public static void setTotalPerson(int total) {
        Person.total = total;
    }
    public Person() {
        total++;
        id = total;
    }
    public static void m(){
        System.out.println("total的值=" + total);
    }
}
