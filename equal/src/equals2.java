public class equals2 {
   public static void main(String [] args){
       Person p1 = new Person();
       p1.name = "mdl";
       Person p2 = new Person();
       p2.name = "mdl";
       System.out.println(p1==p2);
       System.out.println(p1.name .equals(p2.name));
       System.out.println(p1.equals(p2));
       String s1 = new String("asdf");
       String s2 = new String("asdf");
       System.out.println(s1.equals(s2));
       System.out.println(s1==s2);
   }
}
class Person{
    public String name;
}
