public class duixiang8{
    public static void main(String[] args) {
    	A n = new A();
    	int a = 10;
    	int b = 20;
    	n.m(a,b);
    	System.out.println("a= " + a + "b= " + b );
    }
}
class A{
	public void m(int a,int b){
		System.out.println( "a=" + a + "b= " + b);
		int temp = a;
		a = b;
		b = temp;
		System.out.println( "a=" + a + "b=" + b);
	}
}