public class duixiang13{
    public static void main(String[] args) {
 		Person p = new Person();
 		p.name = "Tom";
 		p.age = 20;
 		A b = new A();
 		Person p2 = b.copy(p);
 		System.out.println("p的名字为" + p.name + "  " + "p的年龄为" + p.age);
 		System.out.println("p2的名字为" + p2.name + "  " + "p2的年龄为" + p2.age);
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