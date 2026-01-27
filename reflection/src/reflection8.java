import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class reflection8 {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException, NoSuchMethodException, ClassNotFoundException {
        Class<?> boss = Class.forName("Boss");
        Object o = boss.newInstance();
        Method hi = boss.getMethod("hi",String.class);
        try {
            hi.invoke(o,"mdl");
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        }
        Method declaredMethod = boss.getDeclaredMethod("say", int.class, String.class, char.class);
        declaredMethod.setAccessible(true);
        try {
            System.out.println(declaredMethod.invoke(o,100,"mdl",'男'));
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }
}
class Boss{
    public int age;
    private static String name;
    public Boss(){

    }
    private static String say(int age,String name,char c){
        return   name+c;
    }
    public void hi(String s){
        System.out.println(s);
    }
}