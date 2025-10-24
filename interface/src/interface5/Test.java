package interface5;

public class Test {
    public static void main(String[] args) {
        Littlemonkey littlemonkey = new Littlemonkey("wukong");
        littlemonkey.climbing();
        littlemonkey.swimming();
    }
}
class Monkey{
    private String name;

    public Monkey(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void climbing(){
        System.out.println(name + "会爬树");
    }
}
interface Fish{
    void swimming();
}
interface Bird{
    void fly();
}
class Littlemonkey extends Monkey implements Fish,Bird{
    public Littlemonkey(String name) {
        super(name);
    }

    public void swimming(){
        System.out.println( getName() + "学会了游泳");
    }
    public void fly(){
        System.out.println(getName() + "学会了飞行");
    }
}
