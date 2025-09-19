public class erwei4{
    public static void main(String[] args) {
		int [] zu1 = {10,12,45,90};
		int index = -1;
		int num = 23;
		for(int i = 0;i < zu1.length;i++){
			if(num < zu1 [i]){
				index = i;
				break;
			}
		}
		System.out.println("插入的下标为" + index);
		int  [] zu2 = new int [zu1.length + 1];
		for(int i = 0,j = 0;i < zu2.length;i++){
			if(index != i){
				zu2[i] = zu1[j];
				j++;
			}
			else{
				zu2[i] = num;
			}
		}
		for(int i =0;i < zu2.length;i++){
			System.out.print(zu2 [i] + " ");
		}	   
    }
}