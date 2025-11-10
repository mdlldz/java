import java.util.Arrays;
import java.util.Comparator;

public class arrays1 {
    public static void main(String[] args) {
        int[] a = {1, 2, 5};
        System.out.println(Arrays.toString(a));
        Integer[] b = {5, 1, 8};
        int[] c = {3, 8, 4};
        Arrays.sort(b, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Integer i1 = (Integer) o1;
                Integer i2 = (Integer) o2;
                return i2 - i1;
            }
        });
        bubble02( c, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                int i1 = (Integer) o1;
                int i2 = (Integer) o2;
                return i2 - i1;
            }
        });
        System.out.println(Arrays.toString(b));
        System.out.println(Arrays.toString(c));
    }

    public static void bubble02(int[] zu, Comparator d) {
        int temp = 0;
        for (int i = 0; i < zu.length - 1; i++) {
            for (int j = 0; j < zu.length - i - 1; j++) {
                if(d.compare(zu[j] ,zu[j + 1]) > 0){
                    temp = zu[j];
                    zu[j] = zu[j + 1];
                    zu[j + 1] = temp;
                }
            }
        }
    }
}