import java.util.Scanner;
public class cycle4{
    public static void main(String[] args) {
    	Scanner myScanner = new Scanner(System.in);
    	System.out.println("请输入金字塔行数");
    	int b = myScanner.nextInt();
    	for(int i = 1;i <= b;i++){
    		for(int a = 1; a <= b-i;a++){
    			System.out.print(" ");
			}
    		for(int j = 1;j <= i*2-1;j++){
				if(j == 1 || j == i*2-1|| i == b){
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
    		}
    	System.out.println();
    	}	
	}    			
}	