public class interclass8 {
}
class Outer02{ //外部类
    private int n1 = 10;
    private static String name = "张三";
    static class Inner02{
        public void say(){
            System.out.println(name);
        }
    }
    public void show(){
        new Inner02().say();
    }
}

