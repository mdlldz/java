public class duixiang2{
    public static void main(String[] args) {
 		   Person p = new Person();
 		   p.speak();
 		   p.cal();
 		   p.ca2(10000);
 		   p.ca2(100000);
 		   int result = p.ca3(99,99);
 		   System.out.println("返回值为" + result);
    }
}
class Person{
	String name;
	int age;
	public void speak(){
		System.out.println("mdlldz");
	}
	public void cal(){
		int sum = 0;
		for(int i = 1;i <= 1000;i++){
			sum += i;
		}
		System.out.println(sum);
	}
	public void ca2(int n){
		int sum = 0;
		for(int i = 1;i <= n;i++){
			sum += i;
		}
		System.out.println(sum);
	}
	public int ca3(int n1,int n2){
		int sum = n1 + n2;
		return sum; 		
	}
}