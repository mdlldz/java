import java.util.Scanner;
public class cycle1{
    public static void main(String[] args) {
    	double sum = 0;
    	double count = 0;
        for(int i = 1;i <= 3;i++){
        	for(int j = 1;j <= 5;j++){
    		Scanner myScanner = new Scanner(System.in);
    		System.out.println("������ѧ���ɼ�");
    		double score = myScanner.nextDouble();
    		sum += score;
    		}
        System.out.println("�ð�ƽ����Ϊ" + sum/5);
    	count += sum;
    	}
        System.out.println("��ƽ����Ϊ" + count/15);
    }
}    