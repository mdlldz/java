public class shuzu8{
    public static void main(String[] args) {
    	int [] zu1 ={1,2,3,4,5};
    	do{
    		for(int i = 0;i < zu1.length;i++){
    			System.out.print(zu1[i] + " " );
    		}
    			System.out.println();
    		if(zu1.length == 1){
    			break;
    		}
    		int [] zu2 = new int [zu1.length - 1];
    		for(int i = 0;i < zu2.length;i++){
    			zu2[i] = zu1[i];
    		}
    		zu1 = zu2;
    	}	
		while(true);    
    }
}    