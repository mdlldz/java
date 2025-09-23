public class duixiang3{
    public static void main(String[] args) {
    	int [] [] map ={{1,1,0},{1,1,1},{1,0,1}};
    	Tool mytool = new Tool();
    	mytool.mymap(map);
    	mytool.mymap(map);
    	mytool.mymap(map);
    	}
}
class Tool{
	public void mymap(int [] [] map){
		for(int i = 0;i < map.length;i++){
			for(int j = 0;j < map[i].length;j++){
				System.out.print(map[i][j] );
			}
		System.out.println();
		}
	}
}