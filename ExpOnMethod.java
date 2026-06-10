public class ExpOnMethod {

    public static void main(String[] args) {
        System.out.println("Main Started");
        System.out.println(m1());
        System.out.println("main ended ");
    }

    public static int m1() {
        System.out.println("hello");
        m2();
        return 4;

    }

    public static void m2() {
        System.out.println("hi im m2 method");
        String s = m3();
        System.out.println(s);

    }

    public static String m3() {
        System.out.println("hi im m3 method");
        return "java";
    }
}
