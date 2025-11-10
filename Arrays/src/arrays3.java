import java.util.Arrays;
import java.util.Comparator;

public class arrays3 {
    public static void main(String[] args) {
        Book[] books = new Book [4];
        books [0] = new Book ("红楼梦～", 100);
        books [1] = new Book ("金瓶梅～", 90);
        books [2] = new Book ("青年文摘～", 5);
        books [3] = new Book ("java 从入门到放弃～", 300);
        Arrays.sort(books, new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                Book book1 = (Book) o1;
                Book book2 = (Book) o2;
                double priceVal = book2.getPrice () - book1.getPrice ();
                if (priceVal > 0) {
                    return 1;
                }
                else if (priceVal < 0) {
                    return -1;
                }
                else {
                    return 0;
                }
            }
        });
        System.out.println(Arrays.toString(books));
        Arrays.sort(books, new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                Book book1 = (Book) o1;
                Book book2 = (Book) o2;
                return  book1.getName().length() - book2.getName().length();
            }
        });
        System.out.println(Arrays.toString(books));
    }
}
class Book{
    String name;
    int price;

    public Book(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
