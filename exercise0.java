//求三数中最大值
public class exercise0{
	public static void main(String [] args){
		int a = 1;
		int b = 2;
		int c = 3;
		int max1 = a > b ? a : b;
		int max2 = max1 > c ? max1 : c;
System.out.println( "最大值为" +max2);
		int max = (a > b ? a : b) > c ? (a > b ? a : b):c;
System.out.println("最大值为" +max);
	}
}