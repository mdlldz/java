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
		System.out.println( "ͬ�෽��������" + " " + n);
	}
	public void ca2(){
		ca1(9);
		System.out.println("����ִ��ca2");
	}
	public void m1(){
		System.out.println("B���еķ���������");
		B b = new B();
		b.hi();
		System.out.println("A���m1��������ִ��");
	}
}
class B{
	public void hi(){
		System.out.println("B���е�hi������ִ��");
	}
}