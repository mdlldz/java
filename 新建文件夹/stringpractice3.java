import java.util.Scanner;

public class stringpractice3 {
    public static void main(String[] args) {
        Scanner myscanner = new Scanner(System.in);
        String input = myscanner.nextLine();
        myscanner.close();

        String[] books = input.split(";");
        int total = 0;

        for (String book : books) {
            book = book.trim();
            if (book.isEmpty()) {
                continue;
            }

            String[] parts = book.split(":");
            String name = parts[0].trim();
            int price = Integer.parseInt(parts[1].trim());

            System.out.println(name + "--" + price);
            total += price;
        }

        System.out.println("×Ü¼Û¸ñ--" + total);
    }
}