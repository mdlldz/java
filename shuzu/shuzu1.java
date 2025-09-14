import java.util.Scanner;
public class shuzu1{
    public static void main(String[] args) {
    	Scanner myScanner = new Scanner(System.in);
    	double[] score = new double [5];
    	for(int i = 0;i < score.length;i++ ){
    		System.out.println("请输入" + (i+1) +  "位同学的成绩");
			score[i] = myScanner.nextDouble();
    	}
    	for(int i = 0;i < score.length;i++){
    		System.out.println("第" + (i+1) + "位同学的成绩为" + score[i]);
    	}
    	System.out.println(score);
    }
}    	