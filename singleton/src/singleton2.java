public class singleton2 {
    public static void main(String[] args) {
        Cat bb = Cat.showinfo();
        System.out.println(bb);
        Cat cc = Cat.showinfo();
        System.out.println(cc);
        System.out.println(bb == cc );
    }
}
class Cat{
    private String name;
    private static int n = 100;
    private static Cat aa;

    private Cat(String name) {
        System.out.println("构造器被调用");
        this.name = name;
    }
    public static Cat showinfo(){
        if(aa == null){
           return aa = new Cat("mdl");
        }
        else{
            return aa;
        }
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }
}

