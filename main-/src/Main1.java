import java.util.Objects;

public class Main1 {
    public static String name = "mdl";
    private int n1 = 10000;
    private void cry(){
        System.out.println("Main1的cry方法");
    }
    public static void hi(){
        System.out.println("Main1的hi方法");
    }

    public static void main(String[] args) {
        System.out.println("name=" + name);
        Main1.hi();
        Main1 main1 = new Main1();
        System.out.println(main1.n1);
        main1.cry();
    }
}
