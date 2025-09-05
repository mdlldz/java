	import  java.util.Scanner;
	public class if01{
	public static void main(String [] args){
	Scanner myScanner = new  Scanner(System.in);
	System.out.println("请输入年龄");
	int age = myScanner.nextInt();
	if(age > 18){
	System.out.println("需要对自己行为负责");}
	else{
	System.out.println("无需负责");
	}	
	}
}