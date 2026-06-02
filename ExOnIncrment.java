public class ExOnIncrment {
    public static void main(String[] args) {
        int a = 4;
        int b = a++ + ++a;
        System.out.println(b++ + 6);
        int c = b;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

    }
}
