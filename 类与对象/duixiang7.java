public class duixiang7{
    public static void main(String[] args) {
 		A n = new A();
 		n.print(30,30,'#');  
    }
}
class A{
	 public void print(int row, int rol,char c){
	 	for(int i = 0;i < rol;i++){
	 		for(int j = 0;j < row;j++){
	 			System.out.print(c);
	 		}
	 		System.out.println();
	 	}
	 }
}