public class ExpReturn {
    public static void main(String[] args) {
        System.out.println("Main Started");
        m1();
        System.out.println("main ended ");
    }

    public static void m1() {
        System.out.println("Hi Maam");
        System.out.println(m2());
    }

    public static int m2() {
        int r = 5;
        return r + 5;
    }
}
