import java.util.Scanner;
public class switch1{
	public static void main(String [] args){
		Scanner myScanner = new Scanner (System.in);
		System.out.println("���������");
		double c = myScanner.nextDouble();
		int c1 =(int)(c/60);
		if( 0 <= c && c <= 100){
			switch(c1){
            		case 1 :
            		System.out.println("���Լ���");
            		break;
            		case 0 :
            		System.out.println("���Բ�����");
            		break;          
            }
        }    
        else{
        	System.out.println("�����������");
   	 
	    }

	}
}