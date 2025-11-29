import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class iterator {
    public static void main(String[] args) {
        Collection col = new ArrayList();

        col.add(new Book("三国演义", "罗贯中",10.1));
        col.add(new Book("小李飞刀", "古龙",5.1));
        col.add(new Book("红楼梦", "曹雪芹",34.6));

        Iterator iterator = col.iterator();
        while(iterator.hasNext()) {
            Object next = iterator.next();
            System.out.println(next);
        }
        iterator = col.iterator();
        System.out.println();
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            System.out.println(next);
        }
    }
}
class Book{
    String name;
    String book;
    double price;
    public Book(String name, String book, double price) {
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
        return "Book{" +
                "name='" + name + '\'' +
                ", book='" + book + '\'' +
                ", price=" + price +
                '}';
    }
}

