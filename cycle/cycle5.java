
public class cycle5{
    public static void main(String[] args) {
        for(int i = 1;i <= 5;i++){
            for(int a = 1; a <= 5-i;a++){
                System.out.print(" ");
            }
            for(int j = 1;j <= i*2-1;j++){
                if(j == 1 || j == i*2-1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        } 
        for(int b = 4;b >= 0;b--){
            for(int g = 1; g <= 5-b;g++){
                System.out.print(" ");
            }
            for(int c = 1;c <= b*2-1;c++){
                if(c == 1 || c == b*2-1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }   
    }               
}   