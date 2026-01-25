import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.NoSuchMethodException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

public class reflection1 {
    public static void main(String[] args) throws IOException, InvocationTargetException, IllegalAccessException, InstantiationException, NoSuchMethodException {
        Properties properties = new Properties();
        properties.load(new FileInputStream("src\\re.properties"));
        String classfullpath = properties.get("classfullpath").toString();
        String methodName = properties.get("method").toString();
        System.out.println("classfullpath=" + classfullpath);
        System.out.println("method=" + methodName);

        Class cls = null;
        try {
            cls = Class.forName(classfullpath);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        Object o = cls.newInstance();
        System.out.println("o的运行类型=" + o.getClass());
        Method method1 = null;
            method1 = cls.getMethod(methodName);
        System.out.println("=================================");
        method1.invoke(o);
    }
}
