import java.util.Scanner;
public class break2{
    public static void main(String[] args) {
        int chance = 3;
        String name = "";
        String password = "";
    	Scanner myScanner = new Scanner(System.in);
    	for(int i = 1;i <= 3;i++){
			System.out.println("�������û���");
    		name =myScanner.next();
    		System.out.println("����������");
    		password = myScanner.next();
    		if("Tom".equals(name) && "666".equals(password)){
                System.out.println("��¼�ɹ�");
    			break ;
    		}
            chance--;
            System.out.println("������" + chance + "���������");
    	}
   	}
}    