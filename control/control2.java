import java.util.Scanner;
public class control2{
    public static void main(String[] args) {
    	Scanner myScanner = new Scanner(System.in);
    	System.out.println("����������");
    	int n = myScanner.nextInt();
    	int n1 = n / 100;
    	int n2 = n % 100 / 10;
    	int n3 = n % 10;
    	if((Math.pow(n1,3)) + (Math.pow(n2,3)) + (Math.pow(n3,3)) == n){
			System.out.println("������ˮ�ɻ���");
		}
		else{
			System.out.println("��������ˮ�ɻ���");
		}
    }
}    