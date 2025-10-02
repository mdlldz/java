public class This2{
	public static void main(String [] args){
		Person p1 = new Person("jack",20);
		Person p2 = new Person("mdl",18);
		System.out.println(p1.compareto(p2));
	}
}
class Person{
	String name;
	int age;
	public Person(String name,int age){
		this.name = name;
		this.age = age;
	}
	public Boolean compareto(Person p){
		return this.name == p.name && this.age == p.age;
	}
}