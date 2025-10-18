public class exercise1 {
    public static void main(String[] args){
        Person[] persons = new Person[3];
        persons[0]  = new Person("jack",10, "JavaEE工程师");
        persons[1] = new Person("tom",50, "大数据工程师");
        persons[2] = new Person("mary",30, "PHP工程师");
        Person B = new Person();
        System.out.println(B.A(persons));
    }
}
class Person{
    String name;
    int age;
    String job;

    public Person(String name, int age, String job) {
        this.name = name;
        this.age = age;
        this.job = job;
    }

    public Person() {

    }

    public String A(Person[]persons){
        for (int i = 0; i < persons.length - 1; i++) {
            for (int j = 0; j < persons.length - 1 - i; j++) {
                int temp = 0;
                if(persons[j].age > persons[j + 1].age){
                    temp = persons[j + 1].age;
                    persons[j + 1].age = persons[j].age;
                    persons[j].age = temp;
                }
            }
        }
        return "年龄从小到大为" + persons[0]+ "\t" + persons[1] + "\t"  + persons[2];
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", job='" + job + '\'' +
                '}';
    }
}
