public class Laptop {

    String brand;
    int prize;
    String os;

    public String toString() {
        return this.brand + "," + this.prize + "," + this.os;
    }

    public int hashCode() {
        return this.prize;

    }

    public boolean equals(Object O) {
        Laptop ll = (Laptop) O;
        return this.brand == ll.brand && this.prize == ll.prize && ll.os == this.os;
    }

    public static void main(String[] args) {
        Laptop l1 = new Laptop();
        l1.brand = "hp";
        l1.prize = 40000;
        l1.os = "windows";
        Laptop l2 = new Laptop();
        l2.brand = "Dell";
        l2.prize = 55000;
        l2.os = "windows";

        Laptop l3 = new Laptop();
        l3.brand = "acer";
        l3.prize = 60000;
        l3.os = "Linux";

        System.out.println(l1);
        System.out.println(l2);
        System.out.println(l3);
        System.out.println(l1.hashCode());
        System.out.println(l2.hashCode());
        System.out.println(l3.hashCode());
        System.out.println(l1.equals(l2));
        System.out.println(l2.equals(l3));
        System.out.println(l3.equals(l3));
    }

}
