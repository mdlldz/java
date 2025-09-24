public class duixiang4{
    public static void main(String[] args) {
 		Ca mymap = new Ca();
 		mymap.sumandsub(5,4);
    }
}
class Ca{
	public int[]  sumandsub(int n1,int n2){
		int[] map= new int [2];
		map[0] = n1 + n2;
		map[1] = n1 - n2;
		for(int i = 0;i < map.length;i++){
			System.out.println(map[i] + " ");
		}
		return map;
	}
	public void ca1(){
		return;
	}
	public void ca2(){
		System.out.println();
		return;
	}
}