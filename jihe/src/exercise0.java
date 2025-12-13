import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class exercise0 {
    public static void main(String[] args) {
        HashMap<Integer, Employee0> empMap = new HashMap<>();

        empMap.put(1001, new Employee0("张三", 20000, 1001));
        empMap.put(1002, new Employee0("李四", 17000, 1002));
        empMap.put(1003, new Employee0("王五", 19000, 1003));

        System.out.println("方式1（entrySet遍历）：");
        Set<Map.Entry<Integer, Employee0>> entrySet = empMap.entrySet();
        for (Map.Entry<Integer, Employee0> entry : entrySet) {
            Employee0 emp = entry.getValue();
            if (emp.getSalary() > 18000) {
                System.out.println(emp);
            }
        }

        System.out.println("\n方式2（keySet遍历）：");
        Set<Integer> keySet = empMap.keySet();
        for (Integer empId : keySet) {
            Employee0 emp = empMap.get(empId);
            if (emp.getSalary() > 18000) {
                System.out.println(emp);
            }
        }
    }
}
class Employee0 {
    private String name;
    private double salary;
    private int empId;

    public Employee0(String name, double salary, int empId) {
        this.name = name;
        this.salary = salary;
        this.empId = empId;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{name='" + name + "', salary=" + salary + ", empId=" + empId + "}";
    }
}

