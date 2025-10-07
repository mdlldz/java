public class extenddetail {
        public static void main(String [] args){
            Son son = new Son();
            System.out.println(son.name);
            System.out.println(son.a());
            System.out.println(son.hobby);
        }
}
class Grandpa{
    String name = "爷爷";
    String hobby = "旅游";
}
class Father extends Grandpa{
    String name = "爸爸";
    private int age = 39;
    public int a(){
        return age;
    }
}
class Son extends Father{
    String name = "儿子";
}