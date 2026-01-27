import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class reflection6 {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
    Class cls = Class.forName("User");
        Object o = cls.newInstance();
        System.out.println(o);
        Constructor constructor = cls.getConstructor(String.class);
        Object o1 = constructor.newInstance("ldz");
        System.out.println(o1);
        Constructor declaredConstructor = cls.getDeclaredConstructor(String.class, int.class);
        declaredConstructor.setAccessible(true);
        Object o2 = declaredConstructor.newInstance("ldz", 1);
        System.out.println(o2);

    }
}
class User{
    private String name = "mdl";
    private int age = 10;
    private User(String name, int age) {
        this.name = name;
    }
    public User(String name) {
        this.name = name;
    }
    public User(){

    }
    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
