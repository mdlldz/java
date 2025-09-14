public class shuzu2{
    public static void main(String[] args) {
    	char [] sum = new char [26];
    	int j = 0;
    	for(char i = 'A';i < ('A'+26);i++){
    		j++;
    		sum[j-1] = i;  
    	}
    	System.out.println (sum);
    }
}	