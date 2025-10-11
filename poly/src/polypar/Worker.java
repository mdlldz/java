package polypar;

public class Worker extends Polyee{
    public Worker(String name, double salary) {
        super(name, salary);
    }
    public void work(){
        System.out.println("普通员工" + getName() + "正在工作");
    }
}
