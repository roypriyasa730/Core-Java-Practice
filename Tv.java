public class Tv {

    String brand;
    int price;
    int inches;
    String displayType;

    public static void main(String[] args) {

        Tv tv1 = new Tv();
        tv1.brand = "Samsung";
        tv1.price = 55000;
        tv1.inches = 55;
        tv1.displayType = "LED";

        Tv tv2 = new Tv();
        tv2.brand = "LG";
        tv2.price = 65000;
        tv2.inches = 65;
        tv2.displayType = "OLED";

        System.out.println(tv1.brand);
        System.out.println(tv1.price);
        System.out.println(tv1.inches);
        System.out.println(tv1.displayType);

        System.out.println();

        System.out.println(tv2.brand);
        System.out.println(tv2.price);
        System.out.println(tv2.inches);
        System.out.println(tv2.displayType);
    }
}
