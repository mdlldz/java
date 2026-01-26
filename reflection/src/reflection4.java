import java.io.Serializable;

public class reflection4 {
    public static void main(String[] args) {
        Class<String> cl1 = String.class;
        Class<Serializable> cl2 = Serializable.class;
        Class<Integer> cl3 = Integer.class;
        Class<float[][]> cl4 = float[][].class;
        Class<Deprecated> cl5 = Deprecated.class;
        Class<Thread.State> cl6 = Thread.State.class;
        Class<Long> cl7 = long.class;
        Class<Void> cls8 = void.class;
        Class<Class> cls9 = Class.class;
        System.out.println(cl1);
        System.out.println(cl2);
        System.out.println(cl3);
        System.out.println(cl4);
        System.out.println(cl5);
        System.out.println(cls8);
        System.out.println(cls9);
    }
}
