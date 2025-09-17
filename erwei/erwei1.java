public class erwei1{
    public static void main(String[] args) {
 		int [] [] zu = new int [3] [];
 		for(int i = 0; i < zu.length;i++){
 			zu [i] = new int [i + 1];
 			for(int j = 0;j < zu [i].length;j++){
 				zu[i][j] = i+1;
 				System.out.print(zu[i][j] + " ");
 			}
 			System.out.println();
 		}   
    }
}    	