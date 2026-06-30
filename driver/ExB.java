package driver;

public class ExB extends ExA {
    int age = 22;

    public void displayAge() {
        int a = 8;
        System.out.println(a);
        System.out.println(a);
        System.out.println(this.a);

        System.out.println(super.age);
    }

}
