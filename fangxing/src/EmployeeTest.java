import java.util.ArrayList;
import java.util.Comparator;

public class EmployeeTest {
    public static void main(String[] args) {
        MyDate date1 = new MyDate(3, 15, 1990);
        MyDate date2 = new MyDate(5, 20, 1988);
        MyDate date3 = new MyDate(3, 15, 1992);

        Employee emp1 = new Employee("Zhang", 8000, date1);
        Employee emp2 = new Employee("Li", 9000, date2);
        Employee emp3 = new Employee("Zhang", 8500, date3);

        ArrayList<Employee> empList = new ArrayList<>();
        empList.add(emp1);
        empList.add(emp2);
        empList.add(emp3);

        empList.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee e1, Employee e2) {
                int nameCompare = e1.getName().compareTo(e2.getName());
                if (nameCompare != 0) {
                    return nameCompare;
                }
                MyDate bd1 = e1.getBirthday();
                MyDate bd2 = e2.getBirthday();
                if (bd1.getYear() != bd2.getYear()) {
                    return bd1.getYear() - bd2.getYear();
                }
                if (bd1.getMonth() != bd2.getMonth()) {
                    return bd1.getMonth() - bd2.getMonth();
                }
                return bd1.getDay() - bd2.getDay();
            }
        });

        System.out.println("排序后的Employee列表：");
        for (Employee emp : empList) {
            System.out.println(emp);
        }
    }
}
class MyDate {
    private int month;
    private int day;
    private int year;

    public MyDate(int month, int day, int year) {
        this.month = month;
        this.day = day;
        this.year = year;
    }

    public int getMonth() { return month; }
    public void setMonth(int month) { this.month = month; }
    public int getDay() { return day; }
    public void setDay(int day) { this.day = day; }
    public int getYear() { return year; }
    public void setYear(int year) { this.year = year; }
}
class Employee {
    private String name;
    private double sal;
    private MyDate birthday;

    public Employee(String name, double sal, MyDate birthday) {
        this.name = name;
        this.sal = sal;
        this.birthday = birthday;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public double getSal() { return sal; }
    public void setSal(double sal) { this.sal = sal; }
    public MyDate getBirthday() { return birthday; }
    public void setBirthday(MyDate birthday) { this.birthday = birthday; }

    @Override
    public String toString() {
        MyDate bd = this.getBirthday();
        return "Employee{" +
                "name='" + name + '\'' +
                ", sal=" + sal +
                ", birthday=" + bd.getYear() + "-" + bd.getMonth() + "-" + bd.getDay() +
                '}';
    }
}
