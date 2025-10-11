package polypar;

public class Manger extends Polyee{
    private double bonus;

    public Manger(String name, double salary, double bonus) {
        super(name, salary);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
    public void manger(){
        System.out.println("manger" + getName() + "is mangering");
    }
    public double getaun(){
        return super.getaun() + bonus;
    }
}
