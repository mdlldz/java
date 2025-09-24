public class duixiang6{
    public static void main(String[] args) {
    	AA n = new AA();
    	if(n.A(7)){
    		System.out.println("该数是偶数");
    	}
    	else{
    		System.out.println("该数是奇数");
    	} 
    }
}
class AA{
	public boolean A(int n){
		return n % 2 == 0 ? true:false;
	}
}