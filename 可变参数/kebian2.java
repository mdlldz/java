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
	//�ɱ������Ҫ�����
	public void f2(double n1,int ... n2){
	}
	//�β�����ֻ����һ���ɱ����
	public double f3(double ... n1,double ... n2){
		return 1.0;
	}
}