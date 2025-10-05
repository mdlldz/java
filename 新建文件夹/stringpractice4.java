import java.util.Scanner;
public class stringpractice4{
    public static void main(String[] args) {
        Scanner myscanner = new Scanner(System.in);
        String original = myscanner.nextLine();
        String key = myscanner.nextLine();
        myscanner.close();
        StringBuilder encrypted = new StringBuilder();
        for (int i = 0; i < original.length(); i++) {
            char c = original.charAt(i);
            int keyIndex = i % 5;
            int keyDigit = key.charAt(keyIndex) - '0';
            char encryptedChar = (char) (c + keyDigit);
            encrypted.append(encryptedChar);
        }

        System.out.println(encrypted.toString());
    }
}