public class duixiang13{
    public static void main(String[] args) {
 		Person p = new Person();
 		p.name = "Tom";
 		p.age = 20;
 		A b = new A();
 		Person p2 = b.copy(p);
 		System.out.println("p������Ϊ" + p.name + "  " + "p������Ϊ" + p.age);
 		System.out.println("p2������Ϊ" + p2.name + "  " + "p2������Ϊ" + p2.age);
 		System.out.println(p2 == p);
    }
}
class Person{
	int age;
	String name;
}
class A{
	public Person copy(Person p){
		Person p2 = new Person();
		p2.name = p.name;
		p2.age = p.age;
		return p2;
	} 
}