import java.util.Arrays;

public class import1 {
    public static void main(String [] args){
        int [] zu ={11,55,44,33,88};
        Arrays.sort(zu);
        for (int i = 0; i < zu.length; i++) {
            System.out.print(zu[i] + " ");
        }
    }
}