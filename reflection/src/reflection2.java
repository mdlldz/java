import java.lang.reflect.Field;

public class reflection2 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException, InstantiationException {
        String classpath = "Car";
        Class cls = Class.forName(classpath);
        System.out.println(cls);
        System.out.println(cls.getClass());
        System.out.println(cls.getName());
        System.out.println(cls.getClass());
        Car car = (Car) cls.newInstance();
        System.out.println(car);
        Field field = cls.getField("brand");
        System.out.println(field.get(car));
        field.set(car,"奔驰");
        System.out.println(field.get(car));
        Field[] fields = cls.getFields();
        for (Field field1 : fields) {
            System.out.println(field1.getName());
        }
    }
}