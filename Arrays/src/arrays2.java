import java.util.Arrays;
import java.util.List;

public class arrays2 {
    public static void main(String[] args) {
        Integer [] zu = {1,123,2,90,567};
        int index = Arrays.binarySearch(zu , 55);
        System.out.println(index);
        Integer [] newzu = Arrays.copyOf(zu,zu.length - 1);
        System.out.println(Arrays.toString(newzu));
        Integer [] num = {9,3,2};
        Arrays.fill(num,99);
        System.out.println(Arrays.toString(num));
        boolean Boolean = Arrays.equals(zu,newzu);
        System.out.println(Boolean);
        List asList = Arrays.asList (2,3,4,5,6,1);
        System.out.println ("asList=" + asList);
        System.out.println ("asList 的运行类型" + asList.getClass());
    }
}
