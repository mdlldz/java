public class interclass3 {
    public static void main(String[] args) {
        IA a = new IA() {
            @Override
            public void cry() {
                System.out.println("mdl");
            }
        };
        System.out.println("A的运行类型 = " + a.getClass());
        Father father = new Father("jack"){

        };
        System.out.println(father.getClass());
    }
   Animal animal =  new Animal(){
       @Override
       void eat() {
           System.out.println("肉");
       }
   };
}
interface IA{
    void cry();
}
class Father{
    private String name;

    public Father(String name) {
        this.name = name;
    }
}
abstract class Animal{
    abstract void eat();
}


