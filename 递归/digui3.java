public class digui3{
    public static void main(String[] args) {
 		A c = new A();
 		   System.out.println("第7位斐波那契数列为" + c.b(50));
    }
}
class A{
	public int b(int n){
		if(n >= 1){
			if(n == 1 || n == 2){
			return 1;
			}
			else{
				return b(n - 1) + b(n-2);
			}
		}
		else{
			System.out.println("要求输入n大于等于1的数");
			return -1;
		}
	}
}