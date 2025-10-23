public class abstatact1 {
    public static void main(String[] args) {
        Manger manger = new Manger("jack", 999, 50000);
        manger.setBonus(8000);
        manger.work();
        Common common = new Common("Tom", 888, 20000);
        common.work();
    }
}

abstract class Employee {
    private String name;
    private int id;
    private double salary;

    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public abstract void work();
}

class Manger extends Employee {
    public Manger(String name, int id, double salary) {
        super(name, id, salary);
    }

    private double bonus;

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public void work() {
        System.out.println("经理" + getName() + "正在工作");
    }
}

class Common extends Employee {
    public Common(String name, int id, double salary) {
        super(name, id, salary);
    }

    public void work() {
        System.out.println("普通员工" + getName() + "正在工作");
    }
}
