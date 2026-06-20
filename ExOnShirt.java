public class ExOnShirt {
    String brand;
    String color;
    String size;
    double price;

    void assignShirtDetails(String b, String c, String s, double p) {
        brand = b;
        color = c;
        size = s;
        price = p;
    }

    void displayShirtDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Color: " + color);
        System.out.println("Size: " + size);
        System.out.println("Price: $" + price);
    }

    public static void main(String[] args) {
        ExOnShirt shirt1 = new ExOnShirt();
        shirt1.assignShirtDetails("Nike", "Red", "M", 29.99);
        shirt1.displayShirtDetails();

        ExOnShirt shirt2 = new ExOnShirt();
        shirt2.assignShirtDetails("Adidas", "Blue", "L", 34.99);
        shirt2.displayShirtDetails();

        ExOnShirt shirt3 = new ExOnShirt();
        shirt3.assignShirtDetails("Puma", "Green", "S", 24.99);
        shirt3.displayShirtDetails();
    }
}
