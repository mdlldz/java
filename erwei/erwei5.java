public class erwei5{
    public static void main(String[] args) {
 		int [] zu = new int [10];
 		for(int i = 0;i < zu.length;i++){
 			zu [i] = (int)(Math.random() * 100)+1;
 		}
 		for(int i = 0;i < zu.length;i++){
 			System.out.print( zu[i] + " ");
 		}
 		System.out.println();
 		for(int i = zu.length - 1;i >= 0;i--){
 			System.out.print(zu[i] + " ");
 		}
 		System.out.println();
 		int max = zu[0];
 		int min = zu[0];
 		int sum = 0;
 		int maxnum = 0;
		int minnum = 0;
 		for(int i = 1;i < zu.length;i++){
 			if(max <= zu[i]){
 				max = zu [i];
 				maxnum = i;
 				sum +=  zu[i];
 			}
 			if(min > zu[i]){
 				min = zu[i];
 				minnum = i;
 			}
 		}
 		System.out.println("这些数的平均值为" + sum/10); 
 		System.out.print("最大值为" + max + " " + "下标为" + maxnum + "\n" + "最小值为" + min + " " + "下标为" + minnum + "\n");	
    	int findnum = 8;
    	int index = -1;
    	for(int i = 0 ;i < zu.length;i++){
    		if(zu[i] == findnum){
    			index = i;
    			System.out.println("该数组中有8");
    			break;
    		}
    	}
    	if(index == -1 ){
    		System.out.println("该数组中没有8");
    	}
    }
}