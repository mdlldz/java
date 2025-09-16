public class shuzu4{
    public static void main(String[] args) {
    	int [] zu1 = {10,20,30};
    	int [] zu2 = new int [zu1.length];
    	for(int i = 0;i < zu1.length;i++){
    		 zu2[i] = zu1[i];
    	}
    	zu2[0] = 100;
    	for(int i = 0;i < zu1.length;i++){
    		System.out.print(zu1[i] + " ");
    	}   	
    	for(int i = 0;i < zu1.length;i++){
    		System.out.print(zu2[i] + " ");
    	}   	
    }
}    	