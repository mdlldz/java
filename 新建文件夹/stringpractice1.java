import java.util.Scanner;
public class stringpractice1 {
    public static void main(String[] args) {
        Scanner myscanner = new Scanner(System.in);
        while (myscanner.hasNextLine()) {
            String s = myscanner.nextLine();
            if (s.isEmpty()) {
                System.out.println(false);
            }
            char st = s.charAt(0);
            if (!Character.isJavaIdentifierStart(st)) {
                System.out.println(false);
            }
            boolean valid = true;
            for (int i = 1; i < s.length(); i++) {
                if (!Character.isJavaIdentifierPart(s.charAt(i))) {
                    valid = false;
                    break;
                }
            }
            System.out.println(valid);
        }
        myscanner.close();
    }
}