import java.util.Scanner;
public class switch1{
	public static void main(String [] args){
		Scanner myScanner = new Scanner (System.in);
		System.out.println("请输入分数");
		double c = myScanner.nextDouble();
		int c1 =(int)(c/60);
		if( 0 <= c && c <= 100){
			switch(c1){
            		case 1 :
            		System.out.println("考试及格");
            		break;
            		case 0 :
            		System.out.println("考试不及格");
            		break;          
            }
        }    
        else{
        	System.out.println("输入分数有误");
   	 
	    }

	}
}