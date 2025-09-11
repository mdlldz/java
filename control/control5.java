public class control5{
    public static void main(String[] args) {
    	double sum= 0;
    	for(int n = 1;n <= 100;n++ ){
    		if(n % 2 != 0){
    			sum += 1.0/n;
    		}
    		if(n % 2 == 0){
    			sum -= 1.0/n;
    		}	
    	}
    System.out.println(sum);
    }
}    	