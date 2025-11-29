import org.omg.CORBA.StringHolder;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import static com.sun.org.apache.xml.internal.security.keys.keyresolver.KeyResolver.iterator;

public class collection2 {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(new Dog( "小黑",3));
        list.add(new Dog( "小黄",100));
        list.add(new Dog( "小壮",8));
       for(Object  dog : list){
           System.out.println("dog=" + dog );
       }
        Iterator<Dog> iterator = list.iterator();
        while (iterator.hasNext()) {
            Dog dog = iterator.next();
            System.out.println("dog=" + dog);
        }
    }
}
class Dog{
    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
