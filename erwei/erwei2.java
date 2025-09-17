public class erwei2{
    public static void main(String[] args) {
		int [] [] zu1 = {{4,6},{1,4,5,7},{-2}};
		int sum = 0 ;
		for(int i = 0;i < zu1.length;i++){
			for(int j = 0;j < zu1[i].length;j++){
				sum += zu1[i][j];
			}
		}
		System.out.println("各元素总和为" + sum);  
    }
}    	