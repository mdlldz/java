
enum Gender2{ //父类 Enum 的toString
    BOY, GIRL;
}

public class enum3 {
    public static void main(String[] args) {
        Gender2 boy = Gender2.BOY;//OK
        Gender2 boy2 = Gender2.BOY;//OK
        System.out.println(boy);//输出BOY //本质就是调用 Gender2 的父类 Enum的 toString()
        System.out.println(boy2 == boy); //True
    }
}
