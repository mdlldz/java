	import java.util.Scanner;
	public class if02{
	public static void main(String [] args){
	double n1 = 10.2;
	double n2 = 19.2;
	double n  =n1 + n2;
	if(n1 > 10 && n2 < 20){
	System.out.println("����֮��Ϊ" + n);
	int num1 = 5;
	int num2 = 10;
	int num  =num1 + num2;
	if ((num % 3 == 0) && (num % 5 == 0)){
	System.out.println("�������ͼȿ��Ա�3�����ֿ��Ա�5����");
}
	else{System.out.println("�������Ͳ��ܼȿ��Ա�3�����ֿ��Ա�5����");
	}
    Scanner myScanner = new Scanner(System.in);
    System.out.println("���������");
    int time = myScanner.nextInt();
    if(((time % 4 == 0) && (time % 100 != 0)) || time % 400 == 0){
	System.out.println("����Ϊ����");}
	else{
		System.out.println("���겻������");
	}  
}
}
}