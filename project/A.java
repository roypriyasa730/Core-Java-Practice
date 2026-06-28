package project;

public class A {
    A() {
        System.out.println("im am non para constuctors of a class");

    }

    A(String s) {
        System.out.println(s);
    }

    A(int a) {
        this();
        System.out.println(a++);
        System.out.println("im non para constuctor of a class");

    }

    public static void m1() {
        System.out.println("hi im m1 from a class");
    }
}
