import java.util.Scanner;
public class for1{
	public static void main(String [] args){
		Scanner myScanner = new Scanner(System.in);
		System.out.println("请输入数字");
		int a = myScanner.nextInt();
		System.out.println("请输入除数");
		int b = myScanner.nextInt();
		int count = 0;
		int num   = 0;
		for(int i = 1;i <= a  ; i ++){
			if(i % b == 0){
				System.out.println("i =" +i);
				count++;
				num += i;
			}
		}
		System.out.println("count = " + count);
		System.out.println("num = "  +num);
	}
}