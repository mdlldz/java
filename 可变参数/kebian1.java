public class kebian1{
    public static void main(String[] args) {
 		A b = new A();
 		System.out.println("����֮��Ϊ" + b.sum(1,3,2,4,5));   
    }
}
class A{
	public int sum(int ... nums){
		System.out.println("���ܲ����ĸ���Ϊ" + nums.length );
		int sum = 0;
		for(int i = 0;i < nums.length;i++){
			sum += nums[i]; 
		}
		return sum;
	}
}