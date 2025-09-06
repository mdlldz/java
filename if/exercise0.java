	import java.util.Scanner;
	public class exercise0{
	public static void main(String [] args){
	Scanner myScanner = new  Scanner (System.in);
	System.out.println("请输入月份");
	int time =myScanner.nextInt();
    System.out.println("请输入年龄");
    int age =myScanner.nextInt();
	if( 4 <= time  &&  time <= 10){
    if(18 <= age &&  age<= 60){
    System.out.println("票价为60");
    }
    else{
    if(age <= 18){
	System.out.println("票价为30");}
	else{
	System.out.println("票价为20");} 
    }
    }
    else{if(18 <= age){System.out.println("票价为40");
    }
    else{System.out.println("票价为20");
    }
    }
    }
	}  	