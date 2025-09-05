	import java.util.Scanner;
	public class if02{
	public static void main(String [] args){
	double n1 = 10.2;
	double n2 = 19.2;
	double n  =n1 + n2;
	if(n1 > 10 && n2 < 20){
	System.out.println("俩数之和为" + n);
	int num1 = 5;
	int num2 = 10;
	int num  =num1 + num2;
	if ((num % 3 == 0) && (num % 5 == 0)){
	System.out.println("这俩数和既可以被3整除又可以被5整除");
}
	else{System.out.println("这俩数和不能既可以被3整除又可以被5整除");
	}
    Scanner myScanner = new Scanner(System.in);
    System.out.println("请输入年份");
    int time = myScanner.nextInt();
    if(((time % 4 == 0) && (time % 100 != 0)) || time % 400 == 0){
	System.out.println("该年为闰年");}
	else{
		System.out.println("该年不是闰年");
	}  
}
}
}