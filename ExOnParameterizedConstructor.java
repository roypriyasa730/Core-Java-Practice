public class ExOnParameterizedConstructor {
    int a;
    int b;

    // Parameterized constructor
    public ExOnParameterizedConstructor(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public static void main(String[] args) {

        ExOnParameterizedConstructor obj = new ExOnParameterizedConstructor(10, 20);

        System.out.println(obj.a);
        System.out.println(obj.b);
    }
}
