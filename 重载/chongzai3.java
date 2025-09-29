public class chongzai3{
    public static void main(String[] args) {
 		   A c = new A();
 		   System.out.println("其中的最大值为" + c.b(5,4));
			System.out.println("其中的最大值为" + c.b(5.6,4.4));
    		System.out.println("其中的最大值为" + c.b(5.5,9.1,4.4));
    }
}
class A{
	public int b(int n1,int n2){
		int max = n1 > n2 ? n1 : n2;
		return max;
	}
	public double b(double n1,double n2){
		double max = n1 > n2 ? n1 : n2;
		return max;
	}
	public double b(double n1,double n2,double n3){
		double max1 = n1 > n2 ? n1 : n2;
		double max2 = max1 > n3 ? max1 : n3;
		return max2;
	}
}