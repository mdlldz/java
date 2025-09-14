public class shuzu0{
    public static void main(String[] args) {
      	double [] hens = {3,5,1,3.4,2,50};
      	double sum = 0;
      	for(int i = 0;i <hens.length;i++ ){
      		sum += hens[i];
      	}
      	System.out.println("这些鸡的平均重量为" + (sum / hens.length));
    }
}    

