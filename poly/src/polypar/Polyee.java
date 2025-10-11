package polypar;

public class Polyee {
    private String name;
    private double salary;

    public Polyee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    public double getaun(){
        return 12 * salary;
    }
}
