import java.util.Scanner;
public class switch2{
	public static void main(String [] args){
		Scanner myScanner = new Scanner(System.in);
		System.out.println("�������·�");
		int time = myScanner.nextInt();
		switch(time){
			case 3:
			case 4:
			case 5:
			System.out.println("����");
			break;
			case 6:
			case 7:
			case 8:
			System.out.println("�ļ�");
			break;
			case 9:
			case 10:
			case 11:
			System.out.println("�＾");
			break;
			case 12:
			case 1:
			case 2:
			System.out.println("����");
			break;
		    default:
		}

    }
}
