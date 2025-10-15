public class childgame {
    public static void main(String[] args) {
        A a1 = new A("tom");
        a1.sum();
        a1.accont++;
        A a2 = new A("jack");
        a2.sum();
        a2.accont++;
        A a3 = new A("john");
        a3.sum();
        a3.accont++;
        System.out.println("a1.accout=" + a1.accont);
        System.out.println("a2.accout=" + a2.accont);
        System.out.println("a3.accout=" + a3.accont);
    }
}
class A{
    private String name;
    public static int accont = 0;
    public A(String name) {
        this.name = name;
    }
   public void sum(){
       System.out.println("玩家" + name + "进入游戏");
   }
}
