package extends1.ex;

public class Book extends Item {
    private final String author;
    private final String isbn;
    public Book(String name, int price, String author, String isbn){
        super(name, price);
        this.author = author;
        this.isbn = isbn;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("- 저자:" + this.author + ", isbn:" + this.isbn);
    }
}
