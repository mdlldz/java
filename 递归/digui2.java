public class digui2{
    public static void main(String[] args) {
 		  A c = new A ();
 		  int sum = c.b(3);
 		  System.out.println(sum); 
    }
}
class A{
	public int b(int n){
		if(n == 1){
			return 1;
		}
		else{
			return b(n - 1) * n;
		}
	}
}