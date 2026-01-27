import java.lang.reflect.Field;

public class reflecton9 {
    public static void main(String[] args) throws Exception {
        Class<?> cls = Class.forName("PrivateTest");
        Object o = cls.newInstance();
        Field field = cls.getDeclaredField("name");
        field.setAccessible(true);
        field.set(o, "newValue");
        System.out.println(((PrivateTest) o).getName());
    }
}
class PrivateTest {
    private String name = "hellokitty";
    public String getName() {
        return name;
    }
}
