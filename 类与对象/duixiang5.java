public class duixiang5{
    public static void main(String[] args) {
 		A  sum = new A ();
 		sum.ca2();
 		A a = new A ();
 		a.m1();
    }
}
class A{
	public void ca1(int n){
		System.out.println( "同类方法被调用" + " " + n);
	}
	public void ca2(){
		ca1(9);
		System.out.println("继续执行ca2");
	}
	public void m1(){
		System.out.println("B类中的方法被调用");
		B b = new B();
		b.hi();
		System.out.println("A类的m1方法继续执行");
	}
}
class B{
	public void hi(){
		System.out.println("B类中的hi方法被执行");
	}
}