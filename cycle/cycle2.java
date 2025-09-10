public class cycle2{
    public static void main(String[] args) {
    	int a = 1;
    	for(int i = 1;i <= 9;i++){
    		for(int j = i;j <= 9;j++){
    			System.out.println(  j +  "*" + i + "=" + j*i + "\n");  			
    		}
    	a++;
    	System.out.println();
    	}
    }
}