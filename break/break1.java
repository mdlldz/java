public class break1{
    public static void main(String[] args) {
 		int sum = 0;   	
    	for(int i = 1;i <= 100;i++){
    		System.out.println(i); 
    		sum += i;   	
    		if(sum >= 20){
    			break;
    		}
    	}	 
   	}
}    