public class ExpMethod {
    public static void main(String[] args) {
        System.out.println("Main Started");
        greeting("priyasa");
        System.out.println("main ended ");
    }

    public static void greeting(String name) {
        System.out.println("hi " + name);

    }

    public static void greeting(String name, int age) {
        System.out.println("hi " + name + " your age is " + age);

    }

    public static void greeting(int age, String name) {
        System.out.println("hi " + name + " your age is " + age);

    }

    static void greeting(int age) {
        System.out.println("your age is " + age);

    }

}
