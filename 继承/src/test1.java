public class test1 {
        public static void main(String [] args){
           D d = new D();
        }
}
class F{
    F(){ System.out.println("f"); }
    F(String name) {System.out.println("f name");}
}
class D extends F{
    D(){ this("abc"); System.out.println("d");}
    D(String name){System.out.println("d name");}
}
