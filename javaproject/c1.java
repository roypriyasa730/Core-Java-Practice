package javaproject;

public class c1 {
    int a = 3;
    int b;
    static int k = 5;

    c1() {
        b = 9;
        System.out.println(a++ + b);
    }

    public void display() {
        System.out.println(a);
        System.out.println(b);
    }

}