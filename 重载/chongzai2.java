public class chongzai2{
    public static void main(String[] args) {
 		   A c = new A();
 		   c.b(5);
 		   c.b(2,6);
 		   c.b("mdl");
    }
}
class A{
	public void b(int n){
		System.out.println("平方等于" + n * n);
	}
	public void b(int n1,int n2){
		System.out.println("俩数相乘等于" + n1 * n2);
	}
	public void b(String n){
		System.out.println("接收的字符串为" + n);
	}
}