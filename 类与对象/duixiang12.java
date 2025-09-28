public class duixiang12{
    public static void main(String[] args) {
 		Person d = new Person();
		d.age = 20;
		d.name = "King";
		A f = new A ();
		f.b(d);
		System.out.print(d.name + " " + d.age);
    }
}
class Person{
	int age;
	String name;
}
class A{
	public void b(Person c){
		c = new Person();
		c.name = "Tom";
		c.age  = 666; 
	}
}	