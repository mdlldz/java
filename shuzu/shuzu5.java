public class shuzu5{
    public static void main(String[] args) {
		int [] zu1 = {11,22,33,44,55,66};
		int temp = 0;
		int len = zu1.length;
		for(int i = 0 ; i < len/2;i++){
			temp = zu1[len - 1 - i];
			zu1[len - 1 - i] = zu1 [i]; 
			zu1[i] = temp;
		}
		for(int i = 0; i < len;i++){
			System.out.print(zu1[i] + " ");
		} 
    }
}    