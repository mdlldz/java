import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class reflection5 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException {
       Class cls = Class.forName("Person");
        System.out.println(cls.getName());
        System.out.println(cls.getSimpleName());
        Field[] fields = cls.getFields();
        for(Field field : fields) {
            System.out.println(field.getName());
        }
        Field[] declaredFields = cls.getDeclaredFields();
        for(Field field : declaredFields) {
            System.out.println(field.getName());
        }
        Method[] methods = cls.getMethods();
        for(Method method : methods) {
            System.out.println(method.getName());
        }
        Method [] declaredMethod = cls.getDeclaredMethods();
        for(Method method : declaredMethod) {
            System.out.println(method.getName());
        }
        Constructor[] constructors = cls.getConstructors();
        for(Constructor constructor : constructors) {
            System.out.println(constructor.getName());
        }
        Constructor [] declaredConstructor = new Constructor[]{cls.getDeclaredConstructor()};
        for(Constructor constructor : declaredConstructor) {
            System.out.println(constructor.getName());
        }
        System.out.println(cls.getPackage());
        Class superclass = cls.getSuperclass();
        Class<?>[] interfaces = cls.getInterfaces();
        for (Class<?> anInterface : interfaces) {
            System.out.println("接口信息=" + anInterface);
        }
        Annotation[] annotations = cls.getAnnotations();
        for (Annotation annotation : annotations) {
            System.out.println("注解信息=" + annotation);//注解
        }
    }
}
class A{
    public String hody;
    public void hi(){

    }
    public A(){

    }

}
class Person extends A implements C , B{
    public String name;
    protected int age;
    String job;
    private double salary;
    public Person(){

    }
    public Person(String name){

    }
    private Person(String name,int age,String job){
        this.name=name;
        this.age=age;
        this.job=job;
    }
    public void m1(){

    }
    protected void m2(){

    }
    void  m3(){
    }
    private void m4(){

    }
}
interface B{

}
interface C{}