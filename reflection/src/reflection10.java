import java.io.File;
import java.lang.reflect.Constructor;

public class reflection10 {
    public static void main(String[] args) throws Exception {
        Class<?> fileCls = Class.forName("java.io.File");

        Constructor<?>[] constructors = fileCls.getConstructors();
        for (Constructor<?> constructor : constructors) {
            System.out.println(constructor);
        }

        Constructor<?> constructor = fileCls.getConstructor(String.class);
        File file = (File) constructor.newInstance("mynew.txt");
        file.createNewFile();
    }
}
