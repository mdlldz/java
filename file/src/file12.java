import java.io.*;

public class file12 {
    public static void main(String[] args) throws IOException {
        String failpath = "D:\\data.dat";
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(failpath));
            oos.write(100);
            oos.writeBoolean(true);
            oos.writeChar('a');
            oos.writeDouble(1.4);
            oos.writeUTF("mdl");
            oos.writeObject(new Dog("zn",20));
            oos.writeObject(new Dog("wmw",20));
            oos.close();
    }
}
class Dog implements Serializable {
    private String name;
    private int age;
    private static final long serialVersionUID = 1L;
    protected Dog(String name, int age) {
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
