public class Book {
    String name;
    String author;
    double price;

    public Book() {
        System.out.println("Constructor called");
    }

    public void display() {
        System.out.println("Book Name: " + name);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + price);
    }
}

class BookDriver {
    public static void main(String[] args) {

        Book book = new Book();
        book.display();
    }
}
