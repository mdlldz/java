import java.util.Scanner;
public class break2{
    public static void main(String[] args) {
        int chance = 3;
        String name = "";
        String password = "";
    	Scanner myScanner = new Scanner(System.in);
    	for(int i = 1;i <= 3;i++){
			System.out.println("请输入用户名");
    		name =myScanner.next();
    		System.out.println("请输入密码");
    		password = myScanner.next();
    		if("Tom".equals(name) && "666".equals(password)){
                System.out.println("登录成功");
    			break ;
    		}
            chance--;
            System.out.println("您还有" + chance + "次输入机会");
    	}
   	}
}    