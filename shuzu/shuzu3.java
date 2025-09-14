public class shuzu3{
    public static void main(String[] args) {
    	int [] ints = {4,-1,9,10,23};
    	int max = 0;
    	int maxb= 0;
    	for( int i=0;i < 5;i++){
    		if(max <= ints[i]){
    			max = ints[i];
    			maxb = i;
    		}
    	}
    	System.out.println(max + " " + maxb);
    }
}    	