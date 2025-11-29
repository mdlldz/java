import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class strengthfor {
    public static void main(String[] args) {
        Collection col = new ArrayList();

        col.add(new Book0("三国演义", "罗贯中", 10.1));
        col.add(new Book0("小李飞刀", "古龙", 5.1));
        col.add(new Book0("红楼梦", "曹雪芹", 34.6));
        for(Object book0: col){
            System.out.println("book=" + book0);
        }

    }
}
class Book0 {
    String name;
    String book;
    double price;

    public Book0(String name, String book, double price) {
        this.name = name;
        this.book = book;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBook() {
        return book;
    }

    public void setBook(String book) {
        this.book = book;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book0{" +
                "name='" + name + '\'' +
                ", book='" + book + '\'' +
                ", price=" + price +
                '}';
    }
}
