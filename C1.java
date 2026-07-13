
public class C1 { // Changed 'c1' to 'C1' to follow Java naming conventions
    int a = 3;
    int b;
    static int k = 5;

    public C1() {
        b = 9;
        System.out.println(a++ + b);
    }

    public void display() {
        System.out.println(a);
        System.out.println(b);
        System.err.println(k);
    }
}
