import java.util.Scanner;
public class for2{
	public static void main(String [] args){
		Scanner myScanner = new Scanner(System.in);
        System.out.println("ÇëÊäÈë×ÜºÍ");
        int n = myScanner.nextInt();
		for(int i1 = n , i2 = 0; i1 >= 0;i1--,i2++ ){
			System.out.println(i1 + "+" + i2 + "=" + n); 
		}	
	}
}	