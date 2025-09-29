public class digui1{
    public static void main(String[] args) {
 		A c = new A();
 		c.b(5);
    }
}
class A{
	public void b(int n){
		if(n > 2){
			b(n - 1);
		}
		else{System.out.println("n =" + n);
		}
	}
}	