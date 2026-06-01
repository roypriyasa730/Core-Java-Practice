public class ExOn {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = a + b * 2; // Operator precedence: multiplication before addition
        System.out.println("Result of a + b * 2: " + c); // prints 50

        boolean res1 = (a < b); // Comparison operator
        System.out.println("Is a less than b? " + res1); // prints true

        String res2 = (a + " is less than " + b); // String concatenation
        System.out.println(res2); // prints "10 is less than 20"
    }
}
