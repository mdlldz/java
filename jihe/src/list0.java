import java.util.List;
import java.util.ArrayList;
public class list0 {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(new Book1("红楼梦","曹雪芹", 100.0));
        list.add(new Book1("西游记","吴承恩", 10.0));
        list.add(new Book1("水浒传","施耐庵", 9.0));
        list.add(new Book1("三国演义","罗贯中", 80.0));
        list.add(new Book1("西游记","吴承恩", 10.0));
        for(Object object: list){
            System.out.println(object);
        }
        Book1.sort(list);
    }
}
class Book1{
    private String name;
    private String author;
    private Double price;

    public Book1(String name, String author, Double price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book1{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }
    public static void sort(List list){
         int listSize = list.size();
        for (int i = 0; i < listSize - 1; i++) {
            for (int j = 0; j < listSize - i - j; j++) {
                Book1 book1 = (Book1) list.get(j);
                Book1 book2 = (Book1) list.get(j + 1);
                if(book1.getPrice() > book2.getPrice()){
                    list.set(1 , book2);
                    list.set(2 , book1);
                }
            }
        }
    }
}
