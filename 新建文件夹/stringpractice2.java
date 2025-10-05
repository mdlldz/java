import java.util.Scanner;
public class stringpractice2 {
    public static void main(String[] args) {
        Scanner myscanner = new Scanner(System.in);
        String[] names = new String[20];
        int[] counts = new int[20];
        int size = 0;
        while (true) {
            String line = myscanner.nextLine();
            if (line.equals("end")) {
                break;
            }
            String[] currentNames = line.split(" ");
            for (String name : currentNames) {
                int index = -1;
                for (int i = 0; i < size; i++) {
                    if (names[i].equals(name)) {
                        index = i;
                        break;
                    }
                }
                if (index != -1) {
                    counts[index]++;
                } else {
                    names[size] = name;
                    counts[size] = 1;
                    size++;
                }
            }
        }

        for (int i = 0; i < size; i++) {
            System.out.println(names[i] + " " + counts[i]);
        }

        myscanner.close();
    }
}