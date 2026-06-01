public class ExOnCompoundAssignment {

    public static void main(String[] args) {
        int balance = 2000;
        balance += 1000;
        System.out.println(balance);
        int a = 3000;
        a -= 1500;
        System.out.println(a);
        int b = 40;
        b *= 2;
        System.out.println(b);
        int c = 50;
        c /= 2;
        System.out.println(c);
        int d = 10;
        d %= 2;
        System.out.println(d);
    }

}
