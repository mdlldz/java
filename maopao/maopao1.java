public class maopao1{
    public static void main(String[] args) {
 		   int [] zu = {20,-1,89,2,890,7};
 		   int temp = 0;
 		   for(int i = 0;i < zu.length - 1;i++){
 		   		for(int j = 0;j < zu.length - 1 - i;j++){
 		   			if(zu[j] < zu[j + 1]){
 		   				temp = zu[j];
             	 	 	zu[j] = zu[j + 1];
                		zu[j + 1] = temp;
 		   			}
 		   		}
 		   }
 		   for(int i = 0;i < zu.length;i++){
 		   		System.out.print(zu[i] + " ");
 		   }
    }
}