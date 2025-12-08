import java.util.HashSet;

public class hashset {
    public static void main(String[] args) {
        HashSet set = new HashSet();
        System.out.println(set.add("john"));
        System.out.println(set.add("lucy"));
        System.out.println(set.add("john"));
        System.out.println(set.add("jack"));
        System.out.println(set.add("Rose"));
        set.remove("john");
        System.out.println("set=" + set);
        HashSet set = new HashSet();
        set.add("lucy");
        set.add("lucy");
        set.add("lucy");
        set.add(new Cat("tom"));
        set.add(new Cat("tom"));
        set.add(new Cat("tom"));
        System.out.println("set= " + set);
        set.add(new String("mdl"));
        set.add(new String("mdl"));
        System.out.println("set =" + set);
    }
}
class Cat {
    public String name;

    public Cat(String name) {
        this.name = name;
    }
}
