public class kebian3{
    public static void main(String[] args) {
 		A c = new A ();
 		System.out.println(c.b("Tom",70.2,80.5,77.5));   
    }
}
class A{
	public String b(String name ,double ... nums){
		double sum = 0;
		for(int i =0;i < nums.length;i++){
			sum += nums[i];
		}
		return name + "的" + nums.length + "科总成绩为" + sum;
	}
}