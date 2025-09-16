public class shuzu6{
  public static void main(String[] args) {
    	int [] zu1 = {11,22,33,44,55,66};
    	int [] zu2 = new int[zu1.length];
    	for(int i = 0;i < zu1.length;i++){
    		zu2 [i] = zu1 [zu1.length - i - 1];
    	}
    	for(int i = 0;i < zu2.length;i++){
    		System.out.print(zu2[i] + " ");
    	}
    }
}    