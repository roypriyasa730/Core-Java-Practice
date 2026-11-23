//wirte a program wiche a name book wiche contains the feature as brand,
//authername,title,pice,now create 3 book obj and assieng the data each book obj by using the method call (non satic methon) assigenbookdetails and display 
//each book detils by usi ng non staic call display books.

public class ExpOnBook {
    // Book features (Instance variables)
    String brand;
    String authorName;
    String title;
    double price;

    // Non-static method to assign book details
    public void assignBookDetails(String b, String a, String t, double p) {
        brand = b;
        authorName = a;
        title = t;
        price = p;
    }

    // Non-static method to display book details
    public void displayBookDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Author: " + authorName);
        System.out.println("Title: " + title);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {
        ExpOnBook book1 = new ExpOnBook();
        ExpOnBook book2 = new ExpOnBook();
        ExpOnBook book3 = new ExpOnBook();

        book1.assignBookDetails("Penguin", "Author One", "Book One", 19.99);
        book2.assignBookDetails("HarperCollins", "Author Two", "Book Two", 24.99);
        book3.assignBookDetails("Random House", "Author Three", "Book Three", 29.99);

        // Displaying book details using non-static method calls
        book1.displayBookDetails();
        book2.displayBookDetails();
        book3.displayBookDetails();
    }

}