import java.lang.reflect.Field;

public class reflection7 {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchFieldException {
        Class<?> student = Class.forName("Student");
        Object o = student.newInstance();
        System.out.println(o.getClass().getName());
        Field field = student.getField("age");
        field.set(o,6);
        System.out.println(field.get(o));
        Field name = student.getDeclaredField("name");
        name.setAccessible(true);
        name.set(o ,"mdl");
        System.out.println(name.get(o));
    }
}
class Student {
    public int age;
    private static String name;
    public Student(){

    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age + "name='" + name + '\'' +
                '}';
    }
}