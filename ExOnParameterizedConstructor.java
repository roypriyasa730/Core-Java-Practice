public class ExOnParameterizedConstructor {
    int a;
    int b;

    // Parameterized constructor
    public ExOnParameterizedConstructor(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void display() {
        System.out.println("Value of a: " + a);
        System.out.println("Value of b: " + b);
        System.out.println("Sum of a and b: " + (a + b));
    }

    public static void main(String[] args) {

        ExOnParameterizedConstructor obj = new ExOnParameterizedConstructor(10, 20);

        System.out.println(obj.a);
        System.out.println(obj.b);
    }
}