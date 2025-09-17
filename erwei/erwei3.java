public class erwei3{
    public static void main(String[] args) {
    	int [] [] zu = new int [10] [];
    	for(int i = 0;i < zu.length;i++){
    		zu[i] = new int [i + 1];
    		for(int j = 0;j < zu[i].length;j++){
    			if(j == 0 || j == i ){
    			zu[i][j] = 1;	
    			}
    			else{
    			zu[i][j] = zu[i - 1][j] + zu[i-1][j-1];
    			}
    		}
    	}	
    	for(int i = 0;i < zu.length;i++){
    		for(int j = 0;j < zu[i].length;j++){
    			System.out.print(zu[i][j]  +  " ");
    		}
    		System.out.println();
    	}	

    }
}   	