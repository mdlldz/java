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
 		System.out.println("��Щ����ƽ��ֵΪ" + sum/10); 
 		System.out.print("���ֵΪ" + max + " " + "�±�Ϊ" + maxnum + "\n" + "��СֵΪ" + min + " " + "�±�Ϊ" + minnum + "\n");	
    	int findnum = 8;
    	int index = -1;
    	for(int i = 0 ;i < zu.length;i++){
    		if(zu[i] == findnum){
    			index = i;
    			System.out.println("����������8");
    			break;
    		}
    	}
    	if(index == -1 ){
    		System.out.println("��������û��8");
    	}
    }
}