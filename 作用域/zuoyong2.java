public class zuoyong2{
	public static void main(String [] args){
		Person b = new Person ();
		Person e = new Person ();
		b.a();
		b.c();
		b.d(e);
	}
}
class Person{
	String name = "king";
	public void a(){
		String name = "Tom";
		System.out.println("name = " + name);//属性和局部变量可以重名，遵循就近原则
	}
	public void c(){
		Person p1 = new Person();
		p1.name = "jack";
		System.out.println(p1.name);
	}
	public void d(Person p2){
		p2.name = "jack";
		System.out.println(p2.name);
	}
}