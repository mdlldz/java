	import java.util.Scanner;
	public class exercise{
	public static void main(String [] args){
	Scanner myScanner  = new  Scanner (System.in);
	System.out.println("���������");
	double score = myScanner.nextDouble();
	if(score > 8.0){
	System.out.println("�������Ա�");
	char gender = myScanner.next().charAt(0);
	if(gender == '��'){
	System.out.println("���ѽ���������");}
	else{
	System.out.println("���ѽ���Ů����");}
    }
	else{
	System.out.println("out");
	}
	}
}