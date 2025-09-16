import java.util.Scanner;
public class shuzu7{
    public static void main(String[] args) {
    	int [] zu1 = {1,2,3};
    	do{
    		int [] zu2 = new int [zu1.length + 1];
    		for(int i = 0;i < zu1.length;i++ ){
    			zu2[i] = zu1[i];
    		}
    		Scanner myScanner = new Scanner(System.in);	    	
			System.out.println("请输入添加元素");
			int addnum = myScanner.nextInt();
			zu2[zu1.length] = addnum;
			zu1 = zu2;
			for(int i = 0;i < zu1.length;i++){
				System.out.print(zu1[i] + " " );
			}
			System.out.println("\n" + "是否继续添加，y/n");
			char key = myScanner.next().charAt(0);
			if(key == 'n'){
				break;
			}
		}
		while(true);		
    }
}    