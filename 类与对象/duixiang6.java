public class duixiang6{
    public static void main(String[] args) {
    	AA n = new AA();
    	if(n.A(7)){
    		System.out.println("������ż��");
    	}
    	else{
    		System.out.println("����������");
    	} 
    }
}
class AA{
	public boolean A(int n){
		return n % 2 == 0 ? true:false;
	}
}