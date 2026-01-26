public class reflcetion3 {
    public static void main(String[] args) throws ClassNotFoundException {
        String path = "Car";
        Class cls = Class.forName(path);
        System.out.println(cls);
        Class cls2 = Car.class;
        System.out.println(cls2);
        Car car = new Car();
        Class cls3 = car.getClass();
        System.out.println(cls3);
        ClassLoader loader = car.getClass().getClassLoader();
        Class cls4 = loader.loadClass(path);
        System.out.println(cls4);
        System.out.println(cls.hashCode());
        System.out.println(cls2.hashCode());
        System.out.println(cls3.hashCode());
        System.out.println(cls4.hashCode());
        Class<Integer> integerClass = int.class;
        Class<Character> characterClass = char.class;
        Class<Boolean> booleanClass = boolean.class;
        System.out.println(integerClass);
        System.out.println(characterClass);
        System.out.println(booleanClass);
        Class<Integer> type = Integer.TYPE;
        Class<Character> type1 = Character.TYPE;
        System.out.println(type);
        System.out.println(type1);
        System.out.println(integerClass.hashCode());
        System.out.println(type.hashCode());
    }
}
