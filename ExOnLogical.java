public class ExOnLogical {
    public static void main(String[] args) {
        System.out.println(!(3 > 6)); // true
        System.out.println((3 > 2) && (2 < 1)); // false
        System.out.println(10 == 10); // true
    }

    public static void testLogicalOperators() {
        boolean a = true;
        boolean b = false;

        System.out.println("a && b: " + (a && b)); // false
        System.out.println("a || b: " + (a || b)); // true
        System.out.println("!a: " + (!a)); // false
    }

    public static void testLogicalOperators() {
        boolean a = true;
        boolean b = false;

        System.out.println("a && b: " + (a && b)); // false
        System.out.println("a || b: " + (a || b)); // true
        System.out.println("!a: " + (!a)); // false
    }

}
