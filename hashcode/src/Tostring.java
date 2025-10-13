public class Tostring {
    public static void main(String [] args) {
        Person person = new Person(18, "mdl");
        System.out.println(person.toString() + "hashcode=" + person.hashCode());
        System.out.println(person);}//默认调用tostring
    }
class Person{
    int age;
    String name;
    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
