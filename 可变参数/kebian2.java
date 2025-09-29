public class kebian2{
    public static void main(String[] args) {
 		int [] zu = {2,6,5,4};
 		A b = new A();
 		b.f1(zu);  
    }
}
class A{
	public int f1(int ... sum){
		System.out.println(sum.length);
	}
	//可变参数需要放最后
	public void f2(double n1,int ... n2){
	}
	//形参里面只能有一个可变参数
	public double f3(double ... n1,double ... n2){
		return 1.0;
	}
}