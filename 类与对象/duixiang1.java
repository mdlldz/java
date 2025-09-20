public class duixiang1{
    public static void main(String[] args) {
	   Person a = new Person();
	   Person b = new Person();
		a.name = "ะกร๗";
		a.age = 18;
		b = a;
		System.out.println(a.age);
		b.age = 20;
		b = null;
		System.out.println(a.age);
		System.out.println(b.age);
    }
}
class Person{
	int age;
	String name;
}