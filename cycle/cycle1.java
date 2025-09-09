import java.util.Scanner;
public class cycle1{
    public static void main(String[] args) {
    	double sum = 0;
    	double count = 0;
        for(int i = 1;i <= 3;i++){
        	for(int j = 1;j <= 5;j++){
    		Scanner myScanner = new Scanner(System.in);
    		System.out.println("请输入学生成绩");
    		double score = myScanner.nextDouble();
    		sum += score;
    		}
        System.out.println("该班平均分为" + sum/5);
    	count += sum;
    	}
        System.out.println("总平均分为" + count/15);
    }
}    