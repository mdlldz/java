	import java.util.Scanner;
	public class exercise0{
	public static void main(String [] args){
	Scanner myScanner = new  Scanner (System.in);
	System.out.println("�������·�");
	int time =myScanner.nextInt();
    System.out.println("����������");
    int age =myScanner.nextInt();
	if( 4 <= time  &&  time <= 10){
    if(18 <= age &&  age<= 60){
    System.out.println("Ʊ��Ϊ60");
    }
    else{
    if(age <= 18){
	System.out.println("Ʊ��Ϊ30");}
	else{
	System.out.println("Ʊ��Ϊ20");} 
    }
    }
    else{if(18 <= age){System.out.println("Ʊ��Ϊ40");
    }
    else{System.out.println("Ʊ��Ϊ20");
    }
    }
    }
	}  	