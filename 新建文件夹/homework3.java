public class homework3 {
        public static void main(String [] args){
                Book book = new Book("金瓶梅",999);
                book.info();
                book.updateprice();
                book.info();
            }
}
class Book {
    double price;
    String name;

    public Book(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public void updateprice() {
        if (this.price > 150) {
            this.price = 150;
        }
            else if (this.price > 100) {
                this.price = 100;
            }
    }
    public void info(){
        System.out.println("书名=" + this.name + "价格=" + this.price);
    }
}