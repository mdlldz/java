import java.util.Vector;

public class vector {
    public static void main(String[] args) {
        Vector vector = new Vector();
        for (int i = 0; i < 10; i++) {
            vector.add(i);
        }
        vector.add(100);
        System.out.println("vetor=" + vector );
    }
}
