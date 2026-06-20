public class ExOnShirt {
    String brand;
    String color;
    String size;
    double price;

    public void assignShirtDetails(String b, String c, String s, double p) {
        brand = b;
        color = c;
        size = s;
        price = p;

    }

    public void displayShirtDetails() {
        if (price > 2000)
            System.out.println(brand);
        System.out.println(color);
        System.out.println(size);
        System.out.println(price);
    }

    public static void main(String[] args) {
        ExOnShirt shirt1 = new ExOnShirt();
        shirt1.assignShirtDetails("Nike", "Red", "M", 2400);
        shirt1.displayShirtDetails();

        ExOnShirt shirt2 = new ExOnShirt();
        shirt2.assignShirtDetails("Adidas", "Blue", "L", 3000);
        shirt2.displayShirtDetails();

        ExOnShirt shirt3 = new ExOnShirt();
        shirt3.assignShirtDetails("Puma", "Green", "S", 2400);
        shirt3.displayShirtDetails();
    }

}
