package polyarr;

public class Teacher extends Person {
    private double salary;

    public Teacher(String name, int age, double salary) {
        super(name, age);
        this.salary = salary;
    }
    public String say(){
        return super.say() + "\t" + salary;
    }
    public String teach(){
        return "老师正在授课";
    }
}
