import java.util.Scanner;
public class shuzu1{
    public static void main(String[] args) {
    	Scanner myScanner = new Scanner(System.in);
    	double[] score = new double [5];
    	for(int i = 0;i < score.length;i++ ){
    		System.out.println("������" + (i+1) +  "λͬѧ�ĳɼ�");
			score[i] = myScanner.nextDouble();
    	}
    	for(int i = 0;i < score.length;i++){
    		System.out.println("��" + (i+1) + "λͬѧ�ĳɼ�Ϊ" + score[i]);
    	}
    	System.out.println(score);
    }
}    	