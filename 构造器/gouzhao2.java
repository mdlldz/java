public class gouzhao2{
	public static void main(String [] args){
		Person a = new Person();
		Person b = new Person("mdl",20);
		System.out.println("a的name=" + a.name + "  " + "a的age=" + a.age);
		System.out.println("b的name=" + b.name +  "  " + "b的age=" + b.age);
	}
}
class Person{
	String name;
	int age;
	public Person(){
		age = 18;
	}
	public Person(String pname,int page){
		name = pname;
		age = page;
	}
}