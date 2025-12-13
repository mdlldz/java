import java.util.HashSet;

class  Employee{
    private String name;
    private int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + age;
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee0 employee0 = (Employee0) o;
        return age == employee0.age && (name != null ? name.equals(employee0.name) : employee0.name == null);
    }

    @Override
    public String toString() {
        return "Employee{name='" + name + "', age=" + age + "}";
    }
}
public class hashset0{
    public static void main(String[] args) {
         HashSet<Employee0> employee0s = new HashSet<>();

        employee0s.add(new Employee0("张三", 25));
        employee0s.add(new Employee0("李四", 30));
        employee0s.add(new Employee0("张三", 25));

        System.out.println("HashSet中的员工：");
        for (Employee0 emp : employee0s) {
            System.out.println(emp);
        }
    }
}