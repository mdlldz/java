public class erwei0{
    public static void main(String[] args) {
    	int [] [] zu ={
    		{0,0,0,0,0,0},
    		{0,0,1,0,0,0},
    		{0,2,0,3,0,0},
    		{0,0,0,0,0,0},
    	};
    	for(int i = 0;i < zu.length;i++){
    		for(int j = 0;j < zu[i].length ;j++){
    			System.out.print(zu[i][j] + " ");
    		}
    		System.out.println();
    	}
    }
}    	