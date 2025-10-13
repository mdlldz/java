public class debugexercis1 {
    public static void main(String[] args) {
        //debug对象创建的过程
        Person mdl = new Person("mdl", 20);
        System.out.println(mdl);
    }
}
class Person{
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}