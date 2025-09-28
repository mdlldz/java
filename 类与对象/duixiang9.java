public class duixiang9{
    public static void main(String[] args) {
 		A c	= new A();
 		int [] zu = {100,1,2};
 		c.b(zu);
 		for(int i = 0;i < zu.length;i++){
			System.out.print(zu[i] + " ");
		}
		System.out.println();
    }
}
class A{
	public void b(int [] arr){
		arr[0] = 200;
		for(int i = 0;i < arr.length;i++){
			System.out.print(arr[i] + " ");
		}
		System.out.println( );
	}
}