public class chongzai1{
    public static void main(String[] args) {
 	A c = new A();
 	System.out.println("和为" + c.b(2,2));
	System.out.println("和为" + c.b(2,1.2)); 
    System.out.println("和为" + c.b(2.2,2));
    System.out.println("和为" + c.b(2,2,3));
    }
}
class A{
		public int b(int n1,int n2){
			return n1 + n2;
		}
		public double b(int n1,double n2){
			return n1 + n2;
		}
		public double b(double n2,int n1){
			return n1 + n2;
		}
		public int b(int n1,int n2,int n3){
			return n1 + n2 + n3;
		}
}